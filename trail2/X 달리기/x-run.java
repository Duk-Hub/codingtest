import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // Please write your code here.

        for(int i = 1; i <= 10000; i++){
            int[] arr = new int[i];
            int distance = 0;
            if (i == 1){
                distance = 1;
            } else {
                int speed = 0;
                for(int j = 0; j < (i+1)/2; j++){
                    speed++;
                    distance += speed * 2;
                }
                if(i % 2 != 0) distance -= speed;
            }

            if(distance >= x){
                System.out.println(i);
                return;
            }
        }
    }

}