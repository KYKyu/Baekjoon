import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int open = 1;
        int stick = 1;
        int len = str.length();

        for (int i = 1; i < len; i++) {
            char a = str.charAt(i);
            if (a == ')') {
                if (str.charAt(i - 1) == ')') {
                    open--;
                } else if (str.charAt(i - 1) == '(') {
                    open--;
                    stick--;
                    stick += open;
                }
            } else if (a == '(') {
                open++;
                stick++;
            }
        }

        System.out.println(stick);
        br.close();
    }
}
