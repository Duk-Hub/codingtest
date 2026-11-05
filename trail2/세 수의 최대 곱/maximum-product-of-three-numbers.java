import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        Arrays.sort(arr);

        int answer = 0;
        if(arr[n-1] == 0) {
            answer = 0;
        } else if(arr[n-1] <0){
            answer = arr[n-1] * arr[n-2] * arr[n-3];
        } else {
            int num1 = arr[0] * arr[1] * arr[n-1];
            int num2 = arr[n-1] * arr[n-2] * arr[n-3];
            answer = Math.max(num1,num2);
        }

        System.out.println(answer);
    }
}