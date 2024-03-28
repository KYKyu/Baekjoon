import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        final int mod = 9901;

        int[][] dp = new int[N][3];
        for (int i = 0; i < 3; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < N; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % mod;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % mod;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % mod;
        }

        System.out.println((dp[N - 1][0] + dp[N - 1][1] + dp[N - 1][2]) % mod);
        br.close();
    }
}
