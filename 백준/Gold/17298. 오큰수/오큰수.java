import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                while (true) {
                    if (arr[stack.peek()] < arr[i]) {
                        arr[stack.pop()] = arr[i];
                        if (stack.isEmpty()) {
                            stack.push(i);
                            break;
                        }
                    } else {
                        stack.push(i);
                        break;
                    }
                }
            }
        }

        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
