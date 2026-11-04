import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] position = new int[11];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int pigeon = sc.nextInt();
            int moveDir = sc.nextInt();
            if(position[pigeon] == 0){
                position[pigeon] = (moveDir+1);
            } else if(position[pigeon] != moveDir+1){
                position[pigeon] = moveDir + 1;
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}