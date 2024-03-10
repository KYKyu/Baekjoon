import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int MAX = 1000000;
        boolean[] isSosu = new boolean[MAX + 1];
        isSosu[0] = true;
        isSosu[1] = true;

        for (int i = 0; i < MAX + 1; i++) {
            double maxI = Math.sqrt(i);
            for (int j = 2; j <= maxI; j++) {
                if (i % j == 0) {
                    isSosu[i] = true; // true : 소수 X
                    break;
                }
            }
        }

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                break;
            }

            for (int i = 2; i <= num / 2; i++) {
                if (i % 2 != 0 && !isSosu[i] && !isSosu[num - i]) {
                    sb.append(num).append(" = ").append(i).append(" + ").append(num - i).append("\n");
                    break;
                }
            }
        }

        System.out.println(sb);
        br.close();
    }
}
