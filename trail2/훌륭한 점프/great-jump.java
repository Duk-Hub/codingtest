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

        int answer = 0;
        int min = Math.max(arr[0], arr[n-1]);
        for(int i = min; i <= 100; i++){
            int cnt = 0;
            boolean isMin = true;
            for(int j = 0; j < n; j++){
                if(i < arr[j]){
                    cnt++;
                    if(cnt == k){
                        isMin = false;
                        break;
                    }
                } if (i >= arr[j]){
                    cnt = 0;
                }
            }

            if(isMin) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
