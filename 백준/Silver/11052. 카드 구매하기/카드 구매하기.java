import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] buyOne = new int[N + 1];
        int[] result = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            buyOne[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j <= i; j++) {
                result[i] = Math.max(result[i], result[i - j] + buyOne[j]);
            }
        }

        System.out.println(result[N]);
        br.close();
    }
}
