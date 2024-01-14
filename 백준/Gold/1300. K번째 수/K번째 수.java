import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int start = 1, end = K;
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            int count = 0;

            for (int i = 1; i <= N; i++) {
                if (count >= K) {
                    break;
                }
                count += Math.min(mid / i, N);
            }

            if (count >= K) {
                end = mid - 1;
                result = mid;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(result);
        br.close();
    }
}
