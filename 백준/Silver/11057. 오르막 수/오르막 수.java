import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N + 1][10];
        int mod = 10007;

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 1; i < N + 1; i++) {
            dp[i][0] = 1;
        }

        for (int i = 2; i < N + 1; i++) {
            for (int j = 1; j < 10; j++) {
                dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % mod;
            }
        }

        System.out.println(Arrays.stream(dp[N]).sum() % mod);
        br.close();
    }
}
