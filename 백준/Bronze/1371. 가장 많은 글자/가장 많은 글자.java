import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int[] alp = new int[26];
        String str;

        while ((str = br.readLine()) != null) {
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
                    alp[str.charAt(i) - 97]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (max < alp[i]) {
                max = alp[i];
            }
        }

        for (int i = 0; i < 26; i++) {
            if (alp[i] == max) {
                System.out.print(Character.toChars(i + 97));
            }
        }
        br.close();
    }
}
