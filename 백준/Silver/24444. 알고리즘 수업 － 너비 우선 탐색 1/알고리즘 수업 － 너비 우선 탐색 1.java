import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int cnt = 1;
    static int[] check;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> que = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        for (int i = 0; i < vertex + 1; i++) { // index 혼란을 막고자 index는 1 ~ vertex까지 사용
            graph.add(new ArrayList<>());
        }
        check = new int[vertex + 1];

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int toVertex = Integer.parseInt(st.nextToken());
            int fromVertex = Integer.parseInt(st.nextToken());

            graph.get(toVertex).add(fromVertex);
            graph.get(fromVertex).add(toVertex);
        }

        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        bfs(startVertex);

        for (int i = 1; i < vertex + 1; i++) {
            sb.append(check[i]).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    static void bfs(int vertex) {
        check[vertex] = cnt++;
        que.offer(vertex);

        while (!que.isEmpty()) {
            int a = que.poll();

            for (int i = 0; i < graph.get(a).size(); i++) {
                int nextVertex = graph.get(a).get(i);

                if (check[nextVertex] != 0) {
                    continue;
                }

                check[nextVertex] = cnt++;
                que.offer(nextVertex);
            }
        }
    }
}
