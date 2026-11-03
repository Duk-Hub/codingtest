import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n];
        for (int i = 0; i < n; i++)
            bombs[i] = sc.nextInt();
        // Please write your code here.

        int maxCnt = 0;
        int answer = 0;
        for(int i = 0; i < n; i++){
            int number = bombs[i];
            int prev = i;
            int cnt = 1;
            boolean isBomb = false;
            for(int j = i + 1; j < n; j++){
                if(bombs[j] == number){
                    cnt++;
                    if(j - prev <= k) isBomb = true;
                    prev = j;
                }
            }

            if(isBomb){
                if(maxCnt < cnt){
                    maxCnt = cnt;
                    answer = bombs[i];
                } else if(maxCnt == cnt){
                    answer = Math.max(bombs[i],answer);
                }
            }

        }

        System.out.println(answer);
    }
}