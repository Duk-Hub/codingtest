import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        // Please write your code here.
        int answer = 0;
        char[] arr = str.toCharArray();
        for(int i = 1; i <= n; i++){
            boolean isOnly = true;
            for(int j = 0; j <= n - i; j++){
                String s = str.substring(j,j+i);
                char[] tmp = s.toCharArray();
                int index = 0;
                for(int k = j + 1; k < n; k++){
                    if(arr[k] != tmp[index]){
                        index = 0;
                        continue;
                    }
                    index++;
                    if(index == i){
                        isOnly = false;
                        break;
                    }
                }

                if(!isOnly){
                    break;
                }
            }
            if(isOnly){
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}