import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if(isIntersecting(a,b,c,d)){
            System.out.println(Math.max(b,d) - Math.min(a,c));
        } else {
            System.out.println((b-a) + (d-c));
        }
    }

    public static boolean isIntersecting(int a, int b, int c, int d){
        if(b < c || d < a) return false;
        return true;
    }
}