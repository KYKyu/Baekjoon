import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        long start = 0, end = 0;

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > end) {
                end = arr[i];
            }
        }

        long mid;
        int result = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                if(arr[i] > mid){
                    sum += arr[i] - mid;
                }
            }
            if (sum >= M) {
                start = mid + 1;
                result = (int) mid;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(result);
        br.close();
    }
}
