import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int minNum = 0;
        for(int i = 1; i <= 10000; i++){
            boolean isAnswer = true;
            int num = i;
            for(int j = 0; j < n; j++){
                if(num * 2 < a[j] || num * 2 > b[j]){
                    isAnswer = false;
                    break;
                } else num *= 2;
            }
            if(isAnswer){
                minNum = i;
                break;
            }
        }

        System.out.println(minNum);
    }
}