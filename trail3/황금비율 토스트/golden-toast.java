import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        LinkedList<Character> list = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }

        ListIterator<Character> it = list.listIterator(list.size());

        for (int i = 0; i < m; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch(c){
                case 'L' : {
                    if(it.hasPrevious()) it.previous();
                }
                break;
                case 'R' : {
                    if(it.hasNext()) it.next();
                }
                break;
                case 'P' : {
                    char tmp = command.charAt(2);
                    it.add(tmp);
                }
                break;
                case 'D' : {
                    if(it.hasNext()) {
                        it.next();
                    it.remove();
                    }
                }
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : list){
            sb.append(ch);
        }

        System.out.println(sb);
        
    }
}