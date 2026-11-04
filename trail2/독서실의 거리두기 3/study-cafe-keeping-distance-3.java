import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String seats = sc.next();
        // Please write your code here.

        int maxCnt = 0;
        int cnt = 0;
        int prev = 0;
        int minCnt = Integer.MAX_VALUE;
        for(int i = 1; i < N; i++){
            if(seats.charAt(i) == '0'){
                cnt++;
            }
            if(seats.charAt(i) == '1'){
                minCnt = Math.min(cnt,minCnt);
                maxCnt = Math.max(cnt,maxCnt);
                cnt = 0;
            }
        }

        int answer = Math.min((maxCnt+1)/2,minCnt+1);

        System.out.println(answer);
    }
}