import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            if(a == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if(a == 2) {
                if(stack.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(stack.pop()).append("\n");
                }
            }
            else if(a == 3) {
                sb.append(stack.size()).append("\n");
            }
            else if(a == 4) {
                if(stack.isEmpty()) {
                    sb.append(1).append("\n");
                }
                else {
                    sb.append(0).append("\n");
                }
            }
            else if(a == 5) {
                if(stack.isEmpty()) {
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(stack.peek()).append("\n");
                }
            }
        }

        System.out.println(sb);
        br.close();

    }
}
