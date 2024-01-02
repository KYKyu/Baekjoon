import java.io.*;

public class Main {
    private final static int MOD = 20000303;

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int cur = 0;
        for (int i = 0; i < n.length(); i++) {
            cur*=10;
            cur+=n.charAt(i)-'0';
            cur%=MOD;
        }
        System.out.println(cur);
    }
}
