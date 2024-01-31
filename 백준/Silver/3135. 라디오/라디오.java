import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int current = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());
        int min = Math.abs(current - goal);

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (min > Math.abs(num - goal) + 1) {
                min = Math.abs(num - goal) + 1;
            }
        }

        System.out.println(min);
        br.close();
    }
}
