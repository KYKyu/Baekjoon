import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int MAX = 1000000;
        int T = Integer.parseInt(br.readLine());
        boolean[] isSosu = new boolean[MAX + 1]; // false : sosu, true : not sosu
        isSosu[0] = isSosu[1] = true;

        for (int i = 2; i < MAX + 1; i++) {
            double a = Math.sqrt(i);
            for (int j = 2; j <= a; j++) {
                if (i % j == 0) {
                    isSosu[i] = true;
                    break;
                }
            }
        }

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int i = 2; i <= N / 2; i++) {
                if (!isSosu[i] && !isSosu[N - i]) {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
