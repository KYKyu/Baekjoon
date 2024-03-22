import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "WelcomeToSMUPC";
        int len = str.length();
        int N = Integer.parseInt(br.readLine()) - 1;

        N = N % len;
        System.out.println(str.charAt(N));
        br.close();
    }
}
