import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList <Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            int number;
            // Please write your code here.
            switch(command) {
                case "push_front" : {
                    number = sc.nextInt();
                    list.addFirst(number);
                }
                break;
                case "push_back" : {
                    number = sc.nextInt();
                    list.addLast(number);
                }
                break;
                case "pop_front" : {
                    System.out.println(list.pollFirst());
                }
                break;
                case "pop_back" : {
                    System.out.println(list.pollLast());
                }
                break;
                case "size" : {
                    System.out.println(list.size());
                }
                break;
                case "empty" : {
                    number = list.isEmpty() ? 1 : 0;
                    System.out.println(number);
                }
                break;
                case "front" : {
                    System.out.println(list.peekFirst());
                }
                break;
                case "back" : {
                    System.out.println(list.peekLast());
                }
                break;
            }
        }
    }
}