import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int p = sc.nextInt();
        char[] c = new char[M];
        int[] u = new int[M];
        for (int i = 0; i < M; i++) {
            c[i] = sc.next().charAt(0);
            u[i] = sc.nextInt();
        }
        // Please write your code here.

        int[] lastTime = new int[N];
        for(int i = 0; i < M; i++){
            int idx = c[i] - 'A';
            lastTime[idx] = i+1;
            if(u[i] == 0){
                Arrays.fill(lastTime,i+1);
                continue;
            }

            for(int j = i + 1; j < M; j++){
                if(u[i] == u[j]){
                    lastTime[idx] = j+1;
                }
            }
        }

        for(int i = 0; i < N; i++){
            if(lastTime[i] == 0 || lastTime[i] < p){
                char developer = (char)(i + 'A');
                System.out.print(developer + " ");
            }
        }

    }
}