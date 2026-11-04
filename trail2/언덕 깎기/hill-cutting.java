import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int minCost = Integer.MAX_VALUE;
        for(int i = 1; i <= 100; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                int cost = 0;
                int diff = 0;
                if(arr[j] < i) {
                    diff = i - arr[j];
                    cost = diff * diff;
                } else {
                    diff = arr[j] - i;
                    if(diff > 17){
                        cost = (diff-17) * (diff-17);
                    }
                }
                
                sum += cost;
                
                }
                minCost = Math.min(sum,minCost);

            }
            System.out.println(minCost);
        }

    }
