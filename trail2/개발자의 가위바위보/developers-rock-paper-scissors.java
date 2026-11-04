import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxCnt = 0;
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                if(i==j) continue;
                for(int k = 1; k <= 3; k++){
                    if(i==k || j==k) continue;
                    int cnt = 0;
                    for(int m = 0; m < n; m++){
                        if(a[m] == i && b[m] == j) cnt++;
                        if(a[m] == j && b[m] == k) cnt++;
                        if(a[m] == k && b[m] == i) cnt++;
                    }
                    maxCnt = Math.max(maxCnt,cnt);
                }
            }
        }

        System.out.println(maxCnt);
    }
}