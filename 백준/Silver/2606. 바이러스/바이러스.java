import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    static int count = 0;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int computerNumber = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        check = new boolean[computerNumber + 1];

        for (int i = 0; i < computerNumber + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int toComputer = Integer.parseInt(st.nextToken());
            int fromComputer = Integer.parseInt(st.nextToken());

            graph.get(toComputer).add(fromComputer);
            graph.get(fromComputer).add(toComputer);
        }

        int startComputer = 1;
        dfs(startComputer);
        System.out.println(count - 1);
    }

    static void dfs(int computer) {
        check[computer] = true;
        count++;

        for (int i = 0; i < graph.get(computer).size(); i++) {
            int newComputer = graph.get(computer).get(i);
            if (!check[newComputer]) {
                dfs(newComputer);
            }
        }

    }
}
