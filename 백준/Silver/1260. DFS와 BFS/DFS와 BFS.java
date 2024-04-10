import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Collections;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Queue<Integer> que = new ArrayDeque<>();
    static boolean[] checkDfs;
    static boolean[] checkBfs;
    static StringBuilder sb = new StringBuilder();



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        checkDfs = new boolean[vertex + 1];
        checkBfs = new boolean[vertex + 1];

        for (int i = 0; i < vertex + 1; i++) {
            graph.add(new ArrayList<>());
        }

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

        dfs(startVertex);
        sb.append("\n");
        bfs(startVertex);

        System.out.println(sb);
        br.close();
    }

    static void dfs(int vertex) {
        checkDfs[vertex] = true;
        sb.append(vertex).append(" ");

        for (int i = 0; i < graph.get(vertex).size(); i++) {
            int newVertex = graph.get(vertex).get(i);
            if (!checkDfs[newVertex]) {
                dfs(newVertex);
            }
        }
    }

    static void bfs(int vertex) {
        checkBfs[vertex] = true;
        que.offer(vertex);
        sb.append(vertex).append(" ");

        while (!que.isEmpty()) {
            int a = que.poll();
            for (int i = 0; i < graph.get(a).size(); i++) {
                int newVertex = graph.get(a).get(i);
                if (!checkBfs[newVertex]) {
                    checkBfs[newVertex] = true;
                    que.offer(newVertex);
                    sb.append(newVertex).append(" ");
                }
            }
        }
    }
}
