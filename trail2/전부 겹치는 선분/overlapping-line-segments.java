import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxX1 = Integer.MIN_VALUE;
        int minX2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            maxX1 = Math.max(x1,maxX1);
            minX2 = Math.min(x2,minX2);
        }

        // Please write your code here.
        if(maxX1 <= minX2){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

    }

}