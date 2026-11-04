import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        // Please write your code here.


        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i <= 100; i++){
            int hCnt = 0;
            int lCnt = l;
            for(int j = 0; j < n; j++){
                if(a[j] >= i) hCnt++;
                else if (a[j] + 1 == i && lCnt != 0){
                    lCnt--;
                    hCnt++;
                }
            }

            if(hCnt >= i){
                maxNum = Math.max(maxNum, i);
            }
        }

        System.out.println(maxNum);
    }
}