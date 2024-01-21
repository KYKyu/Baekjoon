import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            boolean flag = true;
            if (str.charAt(0) == '.') {
                break;
            }

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        sb.append("no").append("\n");
                        flag = false;
                        break;
                    } else{
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            sb.append("no").append("\n");
                            flag = false;
                            break;
                        }
                    }
                } else if (c == '}') {
                    if (stack.isEmpty()) {
                        sb.append("no").append("\n");
                        flag = false;
                        break;
                    } else{
                        if (stack.peek() == '{') {
                            stack.pop();
                        } else {
                            sb.append("no").append("\n");
                            flag = false;
                            break;
                        }
                    }

                } else if (c == ']') {
                    if (stack.isEmpty()) {
                        sb.append("no").append("\n");
                        flag = false;
                        break;
                    } else{
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            sb.append("no").append("\n");
                            flag = false;
                            break;
                        }
                    }
                }
            }

            if (stack.isEmpty() && flag) {
                sb.append("yes").append("\n");
            } else if (!stack.isEmpty() && flag) {
                sb.append("no").append("\n");
            }

        }

        System.out.println(sb);
        br.close();
    }
}
