import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int sum = 0;
        int[][] board = new int[101][101];
        int[][] four = new int[4][4];

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                four[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = four[i][0]; j < four[i][2]; j++) {
                for (int k = four[i][1]; k < four[i][3]; k++) {
                    board[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                sum += board[i][j];
            }
        }

        System.out.println(sum);
        br.close();
    }
}
