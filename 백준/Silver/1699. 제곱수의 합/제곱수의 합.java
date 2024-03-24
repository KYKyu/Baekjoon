import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            dp[i] = i;
            if ((int)Math.pow((int)Math.sqrt(i), 2) == i) {
                dp[i] = 1;
                continue;
            }
            for (int j = 1; j * j <= i; j++) {
                int a = dp[i - j * j] + 1;
                if (dp[i] > a) {
                    dp[i] = a;
                }
            }
        }
        System.out.println(dp[N]);
        br.close();
    }
}
