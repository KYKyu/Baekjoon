import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        double skip = (double) N * 15 / 100;

        skip = Math.round(skip);
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        double sum = 0;
        N -= skip * 2;
        for(int i = (int)skip; i < N + skip; i++){
            sum += arr[i];
        }
        System.out.println(Math.round(sum/N));
        br.close();
    }
}
