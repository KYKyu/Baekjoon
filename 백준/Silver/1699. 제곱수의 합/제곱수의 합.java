import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N + 1];
        arr[1] = 1;

        for (int i = 2; i <= N; i++) {
            if ((int)Math.pow((int)Math.sqrt(i), 2) == i) {
                arr[i] = 1;
                continue;
            }

            int min = 100000;
            for (int j = 1; j <= i / 2; j++) {
                int a = arr[i - j] + arr[j];
                if (min > a) {
                    min = a;
                }
            }

            arr[i] = min;
        }
        System.out.println(arr[N]);
        br.close();
    }
}
