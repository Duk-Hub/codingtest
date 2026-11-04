import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        // Please write your code here.
        

        for(int i = nums[0]; i <= 5000; i++){
            int sum = nums[0];
            int cnt = 0;
            boolean isMin = true;
            for(int j = 0; j < n-1; j++){
                if(sum + nums[j+1] > i){
                    cnt++;
                    sum = nums[j+1];
                    if(cnt == m || sum > i){
                        isMin = false;
                        break;
                    }
                } else {
                    sum += nums[j+1];
                }
            }

            if(isMin){
                System.out.println(i);
                return;
            }
        }
    }
}