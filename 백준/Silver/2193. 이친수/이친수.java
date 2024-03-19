import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[][] result = new long[N + 1][2];

        result[1][1] = 1;
        for (int i = 2; i < N + 1; i++) {
            result[i][0] = result[i-1][0] + result[i-1][1];
            result[i][1] = result[i-1][0];
        }

        long sum = result[N][0] + result[N][1];
        System.out.println(sum);
        br.close();
    }
}
