import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger bigInt = new BigInteger(br.readLine(), 8);

        String str = bigInt.toString(2);
        System.out.println(str);
        br.close();
    }
}
