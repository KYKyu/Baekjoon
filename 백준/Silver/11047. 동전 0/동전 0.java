import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int result = 0;

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int start = 0;
        int end = N - 1;
        int mid = (start + end) / 2;
        while (start <= end) { // 시작 값을 찾아옴
            mid = (start + end) / 2;

            if (K == arr[mid]) {
                break;
            } else if (K > arr[mid]) {
                start = mid + 1;
            } else if (K < arr[mid]) {
                end = mid - 1;
            }
        }
        while (K > 0) {
            if (K >= arr[mid]) {
                K -= arr[mid];
                result++;
            } else {
                mid--;
            }
        }
        System.out.println(result);
        br.close();
    }
}
