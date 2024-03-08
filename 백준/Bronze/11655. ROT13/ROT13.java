import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int strLen = str.length();

        for (int i = 0; i < strLen; i++) {
            char c = str.charAt(i);

            if (c >= 65 && c <= 90) {
                if (c + 13 > 90) {
                    c = (char) (65 + (int) c + 13 - 91);
                    sb.append(c);
                } else {
                    c = (char) (c + 13);
                    sb.append(c);
                }
            } else if (c >= 97 && c <= 122) {
                if (c + 13 > 122) {
                    c = (char) (97 + (int) c + 13 - 123);
                    sb.append(c);
                } else {
                    c = (char) (c + 13);
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb);
        br.close();
    }
}
