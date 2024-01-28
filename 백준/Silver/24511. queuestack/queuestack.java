import java.io.*;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        int[] StackOrQueue = new int[N]; //0이면 queue, 1이면 stack
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            StackOrQueue[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int addElement = Integer.parseInt(st.nextToken());
            if(StackOrQueue[i] == 0) {
                deque.offerLast(addElement);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int insert = Integer.parseInt(st.nextToken());
            deque.offerFirst(insert);

            sb.append(deque.pollLast()).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
