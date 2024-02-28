import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        String[] inc = new String[N];

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
            inc[i] = str[i];
        }

        Arrays.sort(inc);
        if (inc[0].equals(str[0])) {
            for (int i = 0; i < N; i++) {
                if (!inc[i].equals(str[i])) {
                    System.out.println("NEITHER");
                    br.close();
                    return;
                }
            }
            System.out.println("INCREASING");
        } else if (inc[0].equals(str[N - 1])) {
            for (int i = 0; i < N; i++) {
                if (!inc[i].equals(str[N - 1 - i])) {
                    System.out.println("NEITHER");
                    br.close();
                    return;
                }
            }
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }

        br.close();
    }
}
