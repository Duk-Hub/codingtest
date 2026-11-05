import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String prev = "AB";
        int aScore = 0;
        int bScore = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String c = sc.next();
            int s = sc.nextInt();

            if(c.equals("A")) aScore += s;
            if(c.equals("B")) bScore += s;

            String now = "";
            if(aScore == bScore) now = "AB";
            if(aScore > bScore) now = "A";
            if(aScore < bScore) now = "B";

            if(!prev.equals(now)) cnt++;

            prev = now;
        }

        System.out.println(cnt);
    }
}