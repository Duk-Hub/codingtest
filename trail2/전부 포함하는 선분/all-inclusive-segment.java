import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        // Please write your code here.


        int answer = 100;
        for(int i = 0; i < n; i++){
            int min = 100;
            int max = 0;
            for(int j = 0; j < n; j++){
                if(i==j) continue;
                min = Math.min(min,x1[j]);
                max = Math.max(max,x2[j]);
            }
            answer = Math.min((max-min),answer);
        }

        System.out.println(answer);

    }
}
