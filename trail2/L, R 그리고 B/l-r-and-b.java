import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] board = new String[10];
        for (int i = 0; i < 10; i++) {
            board[i] = sc.next();
        }
        // Please write your code here.


        int xB = 0;
        int yB = 0;
        int xR = 0;
        int yR = 0;
        int xL = 0;
        int yL = 0;

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(board[i].charAt(j) == 'B'){
                    xB = i;
                    yB = j;
                }
                if(board[i].charAt(j) == 'R'){
                    xR = i;
                    yR = j;
                }
                if(board[i].charAt(j) == 'L'){
                    xL = i;
                    yL = j;
                }
            }
        }

        int answer = Math.abs(xB-xL) + Math.abs(yB-yL) - 1;
        int minX = Math.min(xB,xL);
        int maxX = Math.max(xB,xL);
        int minY = Math.min(yB,yL);
        int maxY = Math.max(yB,yL);

        if(xB == xL && xB == xR && yR > minY && yR < maxY) answer += 2;
        if(yB == yL && yB == yR && xR > minX && xR < maxX) answer += 2;

        System.out.println(answer);
    }
}