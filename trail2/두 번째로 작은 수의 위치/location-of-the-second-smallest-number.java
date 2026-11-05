import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] clone = arr.clone();
        Arrays.sort(clone);

        int secondNum = 0;
        for(int i = 1; i < N; i++){
            if(clone[i] != clone[i-1]){
                secondNum = clone[i];
                break;
            }
        }

        int answer = 0;
        if(secondNum == 0){
            answer = -1;
        }

        int cnt = 0;
        for(int i = 0; i < N; i++){
            if(arr[i] == secondNum){
                cnt++;
                answer = i + 1;
                if(cnt >= 2){
                    answer = -1;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}