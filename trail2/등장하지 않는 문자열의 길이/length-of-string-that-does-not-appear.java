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
                for(int k = j + 1; k <= n - i; k++){
                    String target= str.substring(k, k+i);
                    if(s.equals(target)){
                        isOnly = false;
                        break;
                    }
                }
                if(!isOnly) break;
            }
            if(isOnly){
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}