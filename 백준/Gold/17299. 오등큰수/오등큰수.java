import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] num = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (hm.containsKey(arr[i])) {
                int count = hm.get(arr[i]);
                hm.put(arr[i], ++count);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (int i = 0; i < N; i++) {
            num[i] = hm.get(arr[i]);
        }

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && num[stack.peek()] < num[i]) {
                arr[stack.pop()] = arr[i];
            }

            stack.push(i);
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
