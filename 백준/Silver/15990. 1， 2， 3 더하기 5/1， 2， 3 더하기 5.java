import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int max = 0;
        int mod = 1000000009;

        int[] N = new int[T];

        for (int i = 0; i < T; i++) {
            N[i] = Integer.parseInt(br.readLine());
            if (max < N[i])
                max = N[i];
        }

        long[][] result = new long[max + 1][4];

        result[1][1] = 1;
        result[2][2] = 1;
        result[3][1] = 1;
        result[3][2] = 1;
        result[3][3] = 1;

        for (int i = 4; i < max + 1; i++) {
            result[i][1] = (result[i - 1][2] + result[i - 1][3]) % mod;
            result[i][2] = (result[i - 2][1] + result[i - 2][3]) % mod;
            result[i][3] = (result[i - 3][1] + result[i - 3][2]) % mod;
        }

        for (int i = 0; i < T; i++) {
            long sum = (result[N[i]][1] + result[N[i]][2] + result[N[i]][3]) % mod;
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
