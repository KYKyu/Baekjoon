import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] LIS = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lengthLIS = 1;

        LIS[0] = arr[0];
        for (int i = 1; i < N; i++) {
            if (arr[i] > LIS[lengthLIS - 1]) { //추가
                LIS[lengthLIS] = arr[i];
                lengthLIS++;
            } else { //대치
                int start = 0;
                int end = lengthLIS - 1;
                int idx = 0;

                while (start <= end) {
                    int mid = (end + start) / 2;

                    if (arr[i] > LIS[mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                        idx = mid;
                    }
                }

                LIS[idx] = arr[i];
            }
        }

        System.out.println(lengthLIS);
        br.close();

    }
}
