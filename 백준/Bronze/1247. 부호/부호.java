import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int N = Integer.parseInt(br.readLine());
            BigInteger sum = new BigInteger("0");

            while (N-- > 0) {
                BigInteger num = new BigInteger(br.readLine());
                sum = sum.add(num);
            }

            BigInteger zero = new BigInteger("0");
            if (sum.compareTo(zero) > 0) {
                sb.append("+").append("\n");
            } else if (sum.compareTo(zero) == 0) {
                sb.append("0").append("\n");
            } else {
                sb.append("-").append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}
