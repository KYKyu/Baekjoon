import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int count = 1; // 탐색 순서
    static int[] check; // vertex 탐색 순서를 저장
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // graph 구현
    static StringBuilder sb  = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        check = new int[vertex + 1]; // 인덱스 혼란을 덜고자 1 ~ vertex 까지 사용

        for (int i = 0; i < vertex + 1; i++) {
            graph.add(new ArrayList<>()); // 인덱스 혼란을 덜고자 1 ~ vertex 까지 사용
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int fromVertex = Integer.parseInt(st.nextToken());
            int toVertex = Integer.parseInt(st.nextToken());

            graph.get(fromVertex).add(toVertex); // 무방향 그래프라서 양방향 모두 저장
            graph.get(toVertex).add(fromVertex);
        }

        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        dfs(startVertex);

        for (int i = 1; i < graph.size(); i++) {
            sb.append(check[i]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    static void dfs(int vertex) {
        check[vertex] = count;

        for (int i = 0; i < graph.get(vertex).size(); i++) {
            if (check[graph.get(vertex).get(i)] == 0) {
                count++;
                dfs(graph.get(vertex).get(i));
            }
        }
    }
}
