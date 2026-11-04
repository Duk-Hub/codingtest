import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        Arrays.sort(arr);
        int a = arr[0], b = arr[1], c = arr[2];
        
        int answer = 0;
        int diffA = b - a;
        int diffB = c - b;

        if(diffA == 1 && diffB == 1){
            answer = 0;
        } else if(diffA == 2 || diffB ==2){
            answer = 1;
        } else{
            answer = 2;
        }
        System.out.println(answer);
    }
}