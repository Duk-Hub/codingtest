import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp1 = sc.next();
        String inp2 = sc.next();
        String inp3 = sc.next();
        // Please write your code here.
        int[][] board = new int[3][3];
        board[0] = inp1.chars().map(c -> c - '0').toArray();
        board[1] = inp2.chars().map(c -> c - '0').toArray();
        board[2] = inp3.chars().map(c -> c - '0').toArray();

        boolean[] team = new boolean[100];
        for(int i = 0; i < 3; i++){
            int[] row = board[i];
            checkTeam(row[0],row[1],row[2],team);

            int first = board[0][i];
            int second = board[1][i];
            int third = board[2][i];

            checkTeam(first,second,third,team);
        }

        checkTeam(board[0][0],board[1][1],board[2][2],team);
        checkTeam(board[0][2],board[1][1],board[2][0],team);

        int cnt = 0;
        for(boolean b : team){
            if(b) cnt++;
        }

        System.out.println(cnt);

    }

    public static void checkTeam(int a, int b, int c, boolean[] team){
        if(a == b && b == c) return;
        if(a != b && a != c && b != c) return;

        int min = Math.min(Math.min(a,b),c);
        int max = Math.max(Math.max(a,b),c);

        team[min*10 + max] = true;
    }
}