import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int count = 1;
        for(int i = 0; i < N; i++) {
            for (int j = N - 1 - i; j > 0 ; j--) {
                sb.append(" ");
            }
            for (int j = 0; j < count; j++) {
                sb.append("*");
            }
            sb.append("\n");
            count += 2;
        }

        System.out.println(sb);
        br.close();
    }
}
