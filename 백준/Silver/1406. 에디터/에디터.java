import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> list = new LinkedList<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String initString = br.readLine();

        for (int i = 0; i < initString.length(); i++) {
            list.add(initString.charAt(i));
        }

        ListIterator<Character> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            char command = st.nextToken().charAt(0);
            switch (command) {
                case 'L':
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                    }
                    break;
                case 'D':
                    if (iterator.hasNext()) {
                        iterator.next();
                    }
                    break;
                case 'B':
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
                case 'P':
                    char insertChar = st.nextToken().charAt(0);
                    iterator.add(insertChar);
                    break;
                default:
                    break;
            }
        }

        for (Character c : list) {
            sb.append(c);
        }

        System.out.println(sb);
        br.close();
    }
}