import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            a[i] = sc.nextInt();
        // Please write your code here.

        for(int i = 1; i <= n; i++){
            boolean[] counted = new boolean[n+1];
            int[] original = new int[n];
            int prev = i;
            original[0] = i;
            counted[i] = true;
            boolean isOriginal = true;
            for(int j = 0; j < n -1; j++){
                prev = a[j] - prev;
                if(prev < 1 || prev > n || counted[prev]){
                    isOriginal = false;
                    break;
                }
                original[j+1] = prev;
                counted[prev] = true;

            }

            if(isOriginal){
                for(int number : original){
                    System.out.print(number + " ");
                }
                break;
            }

        }
    }
}