import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            int[] arr = new int[4];
            int len = str.length();

            for (int i = 0; i < len; i++) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                    arr[1]++;
                } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    arr[0]++;
                } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                    arr[2]++;
                } else if (str.charAt(i) == 32) {
                    arr[3]++;
                }
            }

            for (int i = 0; i < 4; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
