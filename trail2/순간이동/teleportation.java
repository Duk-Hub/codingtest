import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.

        int minNum = Integer.MAX_VALUE;
        int a = Math.abs(A-B);
        int b = Math.abs(A-x) + Math.abs(B-y);
        int c = Math.abs(B-x) + Math.abs(A-y);

        System.out.println(Math.min(a,Math.min(b,c))); 
    }
}