import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int mod = 1000000000;

        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i < K + 1; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < N + 1; i++) {
            dp[i][1] = 1;
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 2; j < K + 1; j++) {
                dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % mod;
            }
        }

        System.out.println(dp[N][K] % mod);
        br.close();
    }
}
