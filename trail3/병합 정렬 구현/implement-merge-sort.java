import java.util.Scanner;

public class Main {

    static int[] arr;
    static int[] tmp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        arr = new int[n];
        tmp = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        mergeSort(arr,0,n-1);

        for(int num : arr){
            System.out.print(num + " ");
        }

    }

    static void mergeSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int mid = (low+high)/2;

        mergeSort(arr, low, mid);

        mergeSort(arr, mid+1, high);

        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high){

        int i = low, j = mid + 1, k = low;

        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            tmp[k++] = arr[i++];
        }
        
        while(j <= high){
            tmp[k++] = arr[j++];
        }

        for(int p = low; p <= high; p++){
            arr[p] = tmp[p];
        }
    }
}