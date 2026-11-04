import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        int minCost = Integer.MAX_VALUE;
        int minNum = Integer.MAX_VALUE , maxNum = Integer.MIN_VALUE;
        for(int num : arr){
            minNum = Math.min(num,minNum);
            maxNum = Math.max(num,maxNum);
        }
        for(int i = minNum; i <= maxNum; i++){
            int cost = 0;
            for(int j = 0; j < n; j++){
                if(arr[j] < i){
                    cost += i - arr[j];
                } else {
                    int diff = arr[j] - i;
                    if(diff > k){
                        cost += diff - k;
                    }
                }
            }
            minCost = Math.min(minCost,cost);
        }

        System.out.println(minCost);
    }
}