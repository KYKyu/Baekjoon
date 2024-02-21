import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Boolean> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        Queue<String> que = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());;
        int count = 0;

        while (N-- > 0) {
            String name = br.readLine();
            hm.put(name, true);
        }

        while (M-- > 0) {
            String name = br.readLine();
            if (hm.containsKey(name)) {
                que.offer(name);
                count++;
            }
        }

        String[] str = new String[count];
        for (int i = 0; i < count; i++) {
            str[i] = que.poll();
        }
        Arrays.sort(str);

        sb.append(count).append("\n");
        for (int i = 0; i < count; i++) {
            sb.append(str[i]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
