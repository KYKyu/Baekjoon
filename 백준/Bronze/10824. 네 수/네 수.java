import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken() + "" + st.nextToken());
        long B = Long.parseLong(st.nextToken() + "" + st.nextToken());

        System.out.println(A + B);
        br.close();
    }
}
