import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> hp = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            hp.put(st.nextToken(), st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            String findPW = br.readLine();
            sb.append(hp.get(findPW)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
