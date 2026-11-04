import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        int[] arr = new int[100];
        for(int i = a; i < b; i++){
            arr[i]++;
        }
        for(int i = c; i < d; i++){
            arr[i]++;
        }

        int cnt = 0;
        for(int n : arr){
            if(n != 0) cnt++;
        }

        System.out.println(cnt);
    }
}