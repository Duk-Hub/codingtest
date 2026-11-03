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

        int maxCnt = Integer.MIN_VALUE;
        for(int i = 1; i <= 10000; i++){
            boolean hasNumber = false;
            for(int j = 0; j < n; j++){
                if(arr[j] == i){
                    hasNumber = true;
                    break;
                }
            }

            if(!hasNumber) continue;
            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(arr[j] < i) continue;
                if(arr[j] - i <= k) cnt++;
            }

            maxCnt = Math.max(maxCnt,cnt);
        }

        System.out.println(maxCnt);
    }
}