import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result1 = N * 78 / 100;
        int result2 = N - (N * 20 / 100 * 22 / 100);
        System.out.println(result1 + " " + result2);
        br.close();
    }
}
