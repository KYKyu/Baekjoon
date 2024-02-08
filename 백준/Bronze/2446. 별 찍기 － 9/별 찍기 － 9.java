import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < (N * 2 - 1) - (i * 2); j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int i = 1; i < N; i++) {
            for (int j = N - 1; j > i; j--) {
                sb.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
