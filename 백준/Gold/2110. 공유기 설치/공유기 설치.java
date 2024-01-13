import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int start = 1, end = arr[N - 1] - arr[0];
        int result = 0;

        while (start <= end) {
            int count = 1;
            int mid = (end + start) / 2;

            for (int i = 0; i < N - 1; i++) {
                if (count >= C) {
                    break;
                }
                for (int j = i + 1; j < N; j++) {
                    if (arr[j] - arr[i] >= mid) {
                        count++;
                        i = j - 1;
                        break;
                    }
                }
            }

            if (count >= C) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(result);
        br.close();
    }
}
