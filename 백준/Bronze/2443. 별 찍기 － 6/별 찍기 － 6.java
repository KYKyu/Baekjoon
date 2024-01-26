import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int row = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < row; j++) {
                sb.append(" ");
            }
            for(int j = 0; j < (N * 2 - 1) - (row * 2); j++) {
                sb.append("*");
            }
            sb.append("\n");
            row++;
        }
        System.out.println(sb);
        br.close();
    }
}
