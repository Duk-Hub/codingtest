import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int oddCnt = 0;
        int evenCnt = 0;
        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            if(number % 2 == 0) evenCnt++;
            else oddCnt++;
        }

        int cnt = 0;
        boolean isEvenTurn = true;
        while(true){
            if(isEvenTurn){
                if(evenCnt != 0) {
                    evenCnt--;
                    isEvenTurn = false;
                    cnt++;
                    continue;
                }
                if(evenCnt == 0 && oddCnt >= 2){
                    oddCnt -= 2;
                    isEvenTurn = false;
                    cnt++;
                    continue;
                }
            }
            if(!isEvenTurn){
                if(oddCnt != 0){
                    oddCnt--;
                    isEvenTurn = true;
                    cnt++;
                    continue;
                }
            }

            if(isEvenTurn && evenCnt == 0 && oddCnt == 1){
                oddCnt--;
                cnt--;
            }

            if(oddCnt == 0) break;


        }

        System.out.println(cnt);

    }
}