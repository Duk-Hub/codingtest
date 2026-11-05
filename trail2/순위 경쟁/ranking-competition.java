import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String prev = "ABC";
        int scoreA = 0, scoreB = 0, scoreC = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            String c = sc.next();
            int s = sc.nextInt();

            switch(c){
                case "A" : scoreA += s;
                break;
                case "B" : scoreB += s;
                break;
                case "C" : scoreC += s;
                break;
            }

            String winner = getWinner(scoreA,scoreB,scoreC);

            if(!winner.equals(prev)){
                cnt++;
            }

            prev = winner;
        }

        System.out.println(cnt);
    }

    public static String getWinner(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));

        String winner = "";

        if (a == max) winner += "A";
        if (b == max) winner += "B";
        if (c == max) winner += "C";

        return winner;
    }
}