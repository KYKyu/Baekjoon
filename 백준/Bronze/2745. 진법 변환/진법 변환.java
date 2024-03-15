import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int sum = 0;

        int len = N.length();
        for (int i = 0; i < len; i++) {
            char c = N.charAt(i);
            if (c >= 65 && c <= 90) {
                sum += (int)(c - 55) * (int)Math.pow(B, len - i - 1);
            } else {
                sum += Integer.parseInt(c + "") * (int)Math.pow(B, len - i - 1);
            }
        }

        System.out.println(sum);
        br.close();
    }
}
