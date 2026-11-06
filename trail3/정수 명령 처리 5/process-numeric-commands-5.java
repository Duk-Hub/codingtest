import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String order = sc.next();
            switch(order){
                case "push_back" : {
                    int number = sc.nextInt();
                    list.add(number);
                }
                break;
                case "get" : {
                    int number = sc.nextInt();
                    System.out.println(list.get(number-1));
                }
                break;
                case "size" : {
                    System.out.println(list.size());
                }
                break;
                default : {
                    list.remove(list.size()-1);
                }
            }
        }
    }
}