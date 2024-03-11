import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int a = n;
        int b = n - m;
        int c = m;

        int five = fivePower(a) - fivePower(b) - fivePower(c);
        int two = twoPower(a) - twoPower(b) - twoPower(c);

        System.out.println(Math.min(five, two));
        br.close();
    }

    static int fivePower(int n) {
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    static int twoPower(int n) {
        int count = 0;
        while (n >= 2) {
            count += n / 2;
            n /= 2;
        }
        return count;
    }
}
