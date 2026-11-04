import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        // Please write your code here.

        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[j] - 'A' == i){
                    if(j == i) break;
                    char tmp = arr[j];
                    for(int k = j; k > i; k--){
                        arr[k] = arr[k-1];
                    }
                    arr[i] = tmp;
                    cnt += (j - i);
                }
            }
        }

        System.out.println(cnt);
    }
}