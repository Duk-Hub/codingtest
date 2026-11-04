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

        boolean isPossible = false;
        for(int i = 0; i < n; i++){
            int maxX1 = Integer.MIN_VALUE;
            int minX2 = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                maxX1 = Math.max(maxX1,x1[j]);
                minX2 = Math.min(minX2,x2[j]);
            }

            if(minX2 >= maxX1){
                isPossible = true;
                break;
            }
        }

        if(isPossible){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}