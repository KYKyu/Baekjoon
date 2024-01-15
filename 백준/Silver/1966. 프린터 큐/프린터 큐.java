import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            Queue<Integer> que = new LinkedList<>();
            int count = 0;

            int[] arr = new int[N];

            st = new StringTokenizer(br.readLine());
            int a;
            for (int i = 0; i < N; i++) {
                a = Integer.parseInt(st.nextToken());
                que.add(a);
                arr[i] = a;
            }

            Arrays.sort(arr);

            int X = 1;
            int cpN = N;
            while (true) {
                int com = que.peek();
                if (com < arr[N - X]) {
                    if (M == 0) {
                        M = cpN - 1;
                    } else {
                        M--;
                    }
                    que.poll();
                    que.add(com);
                } else if (com == arr[N - X]) {
                    count++;
                    if (M == 0) {
                        sb.append(count).append("\n");
                        break;
                    }
                    que.poll();
                    cpN--;
                    X++;
                    M--;
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}
