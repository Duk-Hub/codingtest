import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        for(int exp = 1; exp <= 100000; exp *= 10){
            List<List<Integer>> newArr = new ArrayList<>();

            for(int i = 0; i < 10; i++){
                newArr.add(new ArrayList<>());
            }

            for(int i = 0; i < n; i++){
                int digit = (arr[i]/exp) % 10;
                newArr.get(digit).add(arr[i]);
            }

            int[] sorted = new int[n];
            int index = 0;

            for(int i = 0; i < 10; i++){
                for(int j = 0; j < newArr.get(i).size(); j++){
                    sorted[index] = newArr.get(i).get(j);
                    index++;
                }
            }

            arr = sorted;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}