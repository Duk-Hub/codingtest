import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seat = sc.next();
        // Please write your code here.
        int[] seats = new int[n];
        for(int i = 0; i < n; i++){
            seats[i] = seat.charAt(i) - '0';
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(seats[i] == 1) continue;
            
            int[] tmp = seats.clone();
            tmp[i] = 1;
            int minDistance = Integer.MAX_VALUE;

            boolean start = false;
            int cnt = 1;
            for(int j = 0; j < n; j++){
                if(tmp[j] == 1 && !start){
                    start = true;
                    continue;
                }
                if(tmp[j] == 1 && start){
                    minDistance = Math.min(minDistance,cnt);
                    cnt = 1;
                }
                if(tmp[j] == 0 && start) cnt++;
            }
            max = Math.max(minDistance,max);
        }

        System.out.println(max);
    }
}