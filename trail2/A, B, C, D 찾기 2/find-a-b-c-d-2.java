import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        Arrays.sort(arr);
        for(int a = 1; a <= 40; a++){
            for(int b = a; b <= 40; b++){
                for(int c = b; c <= 40; c++){
                    for(int d = c; d <= 40; d++){
                        int[] tmp = {
                            a, b, c, d,
                            a + b, b + c, c + d, d + a, a + c, b + d,
                            a + b + c, a + b + d, a + c + d, b + c + d,
                            a + b + c + d
                        };

                        Arrays.sort(tmp);
                        if(Arrays.equals(arr,tmp)){
                            System.out.println(a + " " + b + " " + c + " " + d);
                        }
                    }
                }
            }
        }

    }
}