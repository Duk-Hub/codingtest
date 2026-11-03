import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] numbers = new int [M][2];
        for (int i = 0; i < M; i++) {
            numbers[i][0] = sc.nextInt();
            numbers[i][1] = sc.nextInt();
        }

        int maxCnt = Integer.MIN_VALUE;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                if(i == j) continue;
                int cnt = 0;
                for(int k = 0; k < M; k++){
                    if((numbers[k][0] == i && numbers[k][1] == j)||(numbers[k][0] == j && numbers[k][1] == i)) cnt++;
                }
                maxCnt = Math.max(maxCnt,cnt);
            }
        }

        System.out.println(maxCnt);
    }
}