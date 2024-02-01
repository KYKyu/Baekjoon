import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String str = st.nextToken();
                int strLength = str.length();
                char[] chars = new char[strLength];
                for (int i = 0, j = strLength - 1; i < strLength; i++, j--) {
                    chars[i] = str.charAt(j);
                }
                sb.append(chars).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
