import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seat = sc.next();


        int maxDistance = Integer.MIN_VALUE;
        for(int i = 0; i < n - 1; i++){
            if(seat.charAt(i) == '1') continue;
            for(int j = i + 1; j < n; j++){
                if(seat.charAt(j)== '1') continue;
                int prev = -1;
                int minDistance = Integer.MAX_VALUE;
                for(int k = 0; k < n; k++){
                    if(seat.charAt(k) == '1' || k == i || k == j){
                        if(prev != -1){
                            minDistance = Math.min(minDistance, k - prev);
                        }
                        prev = k;
                    }
                }
                maxDistance = Math.max(maxDistance,minDistance);

            }
        }

        System.out.println(maxDistance);
    }
}