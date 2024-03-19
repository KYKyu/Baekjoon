import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] result = new int[N + 1][9 + 1];

        for (int i = 1; i < 10; i++) {
            result[1][i] = 1;
        }

        for (int i = 2; i < N + 1; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    result[i][j] = result[i - 1][j + 1];
                } else if (j == 9) {
                    result[i][j] = result[i - 1][j - 1];
                } else {
                    result[i][j] = (result[i - 1][j + 1] + result[i - 1][j - 1]) % 1000000000;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = (sum + result[N][i]) % 1000000000;
        }
        
        System.out.println(sum % 1000000000);
        br.close();
    }
}