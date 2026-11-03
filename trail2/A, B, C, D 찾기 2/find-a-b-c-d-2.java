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
        int sumAll = arr[14];
        int a = arr[0];
        int b = arr[1];
        int c = 0;
        if(arr[2] != a + b){
            c = arr[2];
        } else c = arr[3];
        int d = sumAll - a - b - c;

        System.out.println(a + " " + b + " " + c + " " + d);

    }
}