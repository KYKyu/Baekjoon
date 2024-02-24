import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> hm = new HashMap<>();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (hm.containsKey(arr[i])) {
                int a = hm.get(hm.get(arr[i])) + 1;
                hm.put(arr[i], a);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (int i = 0; i < N; i++) {
            if (hm.get(arr[i]) > 0 && hm.containsKey(M - arr[i]) && hm.get(M - arr[i]) > 0 && arr[i] != M - arr[i]) {
                int a = hm.get(arr[i]) - 1;
                int b = hm.get(M - arr[i]) - 1;

                hm.put(arr[i], a);
                hm.put(M - arr[i], b);
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}
