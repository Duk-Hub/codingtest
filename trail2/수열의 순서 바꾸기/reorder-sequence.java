import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        int idx = 0;
        for(int i = n-1; i > 0; i--){
            if(arr[i] < arr[i-1]){
                idx = i;
                break;
            }
        }

        System.out.println(idx);
    }
}