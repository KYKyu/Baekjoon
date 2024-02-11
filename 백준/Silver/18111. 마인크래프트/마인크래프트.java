import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int minHeight = 256, maxHeight = 0;
        int resultTime = 2100000000, resultHeight = 0;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] minecraft = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                minecraft[i][j] = Integer.parseInt(st.nextToken());
                if (minecraft[i][j] < minHeight) {
                    minHeight = minecraft[i][j];
                }
                if (minecraft[i][j] > maxHeight) {
                    maxHeight = minecraft[i][j];
                }
            }
        }

        for (int i = minHeight; i <= maxHeight; i++) {
            int time = 0;
            int haveBlock = B;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    int currentHeight = minecraft[j][k];
                    if (currentHeight > i) {
                        haveBlock += currentHeight - i;
                        time += (currentHeight - i) * 2;
                    } else if (currentHeight < i) {
                        haveBlock -= i - currentHeight;
                        time += i - currentHeight;
                    }
                }
            }

            if (haveBlock < 0) {
                break;
            }

            if (time < resultTime) {
                resultTime = time;
                resultHeight = i;
            } else if (time == resultTime) {
                resultHeight = i;
            }
        }

        System.out.println(resultTime + " " + resultHeight);
        br.close();
    }
}
