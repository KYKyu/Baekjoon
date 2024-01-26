import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        int idx = K - 1;
        while (N > 0) {
            while (idx >= N) {
                idx -= N;
            }
            que.add(arr[idx]);
            for (int i = idx; i < N - 1; i++) {
                arr[i] = arr[i + 1];
            }
            N--;
            idx += K - 1;
        }

        sb.append("<");
        int len = que.size();
        while(len-- > 1) {
            sb.append(que.poll()).append(", ");
        }
        sb.append(que.poll()).append(">");
        System.out.println(sb);
        br.close();
    }
}
