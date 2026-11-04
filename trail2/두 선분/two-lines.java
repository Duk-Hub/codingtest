import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        // Please write your code here.

        boolean isIntersecting = false;
        if(x1 >= x3 && x1 <= x4) isIntersecting = true;
        if(x2 >= x3 && x2 <= x4) isIntersecting = true;
        if(x3 >= x1 && x3 <= x2) isIntersecting = true;
        if(x4 >= x1 && x4 <= x2) isIntersecting = true;

        if(isIntersecting){
            System.out.println("intersecting");
        } else {
            System.out.println("nonintersecting");
        }
    }
}