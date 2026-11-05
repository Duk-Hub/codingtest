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

    public static String getWinner(int a, int b, int c){
        if(a == b && b == c) return "ABC";
        if(a == b && a > c) return "AB";
        if(a == c && a > b) return "AC";
        if(b == c && b > a) return "BC";
        if(a > b && a > c) return "A";
        if(b > a && b > c) return "B";
        if(c > a && c > b) return "C";
        return "";
    }
}