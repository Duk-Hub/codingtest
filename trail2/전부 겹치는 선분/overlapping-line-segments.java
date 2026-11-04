import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        // Please write your code here.
        boolean isAllIntersecting = true;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(!isIntersecting(x1[i],x2[i],x1[j],x2[j])){
                    isAllIntersecting = false;
                    break;
                }
            }
        }

        if(isAllIntersecting){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

    }

    public static boolean isIntersecting(int x1, int x2, int a1, int a2){
        if(a1 > x2 || a2 < x1) return false;
        return true;
    }
}