import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        while (true) {
            stack.push(N % T);
            N /= T;
            if (N < T && N != 0) {
                stack.push(N);
                break;
            } else if (N == 0) {
                break;
            }
        }

        while (!stack.isEmpty()) {
            int a = stack.pop();
            if (a >= 10) {
                sb.append((char)(a +55));
            } else {
                sb.append(a);
            }
        }

        System.out.println(sb);
        br.close();
    }
}
