import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int round = N;
        st = new StringTokenizer(br.readLine());

        int[][] arr = new int[N][2];
        for (int i = 0; i < round; i++) {
            arr[i][0] = i + 1;
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int idx = 0;
        for (int i = 0; i < round; i++) {
            while (!(idx >= 0 && idx < N)) {
                if(idx < 0) {
                    idx = N + idx;
                } else if (idx > N - 1) {
                    idx = idx - N;
                }
            }

            que.offer(arr[idx][0]);

            int a = idx;

            if (arr[idx][1] >= 0) {
                idx += arr[idx][1] - 1;
            } else {
                idx += arr[idx][1];
            }

            for(int j = a; j < N - 1; j++) {
                arr[j] = arr[j + 1];
            }

            N--;
        }

        for (int i = 0; i < round; i++) {
            sb.append(que.poll()).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
