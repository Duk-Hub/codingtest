import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // Please write your code here.

        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < n - 1; i++){
                if(arr[i] > arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    sorted = false;
                    break;
                }
            }
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}