import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long start = 1, end = 0;
        int result = 1;

        int[] arr = new int[K];
        for(int i = 0; i < K; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > end){
                end = arr[i];
            }
        }

        while(start <= end){
            long mid = (start + end) / 2;
            long num = 0;
            for(int i = 0; i < K; i++){
                num += arr[i] / mid;
            }

            if (num >= N) {
                result = (int)mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }
        System.out.println(result);
        br.close();
    }
}
