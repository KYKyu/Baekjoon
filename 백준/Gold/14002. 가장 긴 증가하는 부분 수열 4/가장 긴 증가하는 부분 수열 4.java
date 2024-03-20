import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int[] seq = new int[N];
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N];
        dp[0] = 1;
        ArrayList<Integer> addFirst = new ArrayList<>();
        addFirst.add(seq[0]);
        list.add(addFirst);

        int result = 1;
        int resultIdx = 0;
        for (int i = 1; i < N; i++) {
            int idx = -1;
            int max = 0;
            ArrayList<Integer> add = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (seq[i] > seq[j] && max < dp[j]) {
                    max = dp[j];
                    idx = j;
                }
            }

            dp[i] = max + 1;
            if (result < dp[i]) {
                result = dp[i];
                resultIdx = i;
            }

            if (idx != -1) {
                add.addAll(list.get(idx));
                add.add(seq[i]);
            } else {
                add.add(seq[i]);
            }

            list.add(add);
        }

        sb.append(result).append("\n");
        for (int i = 0; i < result; i++) {
            sb.append(list.get(resultIdx).get(i)).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
