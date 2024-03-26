import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int max = 1000000;
        int mod = 1000000009;
        int[] dp = new int[max + 1];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < max + 1; i++) {
            dp[i] = ((dp[i - 1] + dp[i - 2]) % mod + dp[i - 3]) % mod;
        }

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            sb.append(dp[N] % mod).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
