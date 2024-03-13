import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        String str = br.readLine();
        str = sb1.append(str).reverse().toString();

        int len = str.length();

        int mul = 1;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '1') {
                sum += mul;
            }
            mul *= 2;
            if (mul == 8 || i == len - 1) {
                stack.push(sum);
                count++;
                mul = 1;
                sum = 0;
            }
        }

        for (int i = 0; i < count; i++) {
            sb2.append(stack.pop());
        }
        System.out.println(sb2);
    }
}
