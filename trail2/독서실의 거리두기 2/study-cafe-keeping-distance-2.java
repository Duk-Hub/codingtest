import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seats = sc.next();
        // Please write your code here.

        int maxCnt = 0;
        for(int i = 0; i < n; i++){
            if(seats.charAt(i) == '1') continue;
            int prev = -1;
            int minCnt = Integer.MAX_VALUE;
            int cnt = 1;
            for(int j = 0; j < n; j++){
                if(seats.charAt(j) == '1' || j == i){
                    if(prev != -1){
                        minCnt = Math.min(cnt,minCnt);
                        cnt = 1;
                    } else{
                        prev = j;
                    }
                } else {
                    if(prev != -1) cnt++;
                }
            }

            maxCnt = Math.max(maxCnt,minCnt);
        }

        System.out.println(maxCnt);
    }
}