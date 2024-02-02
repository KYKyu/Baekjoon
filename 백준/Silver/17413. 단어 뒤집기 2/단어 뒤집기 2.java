import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }

                flag = false;
                sb.append(str.charAt(i));
                continue;
            } else if (str.charAt(i) == '>') {
                flag = true;
                sb.append(str.charAt(i));
                continue;
            }

            if (flag == true) {
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                } else {
                    stack.push(str.charAt(i));
                }
            } else {
                sb.append(str.charAt(i));
            }



        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
        br.close();
    }
}
