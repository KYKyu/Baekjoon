import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        String math = br.readLine();
        int mathLen = math.length();
        Double[] AZ = new Double[N];
        for (int i = 0; i < N; i++) {
            AZ[i] = 0.0;
        }

        for (int i = 0; i < mathLen; i++) {
            char mathChar = math.charAt(i);
            if (mathChar >= 65 && mathChar <= 90) {
                if (AZ[mathChar - 65] == 0.0) {
                    AZ[mathChar - 65] = Double.parseDouble(br.readLine());
                }
                stack.push(AZ[mathChar - 65]);
            } else if (mathChar == '*') {
                double a = stack.pop();
                double b = stack.pop();

                stack.push(b * a);
            } else if (mathChar == '/') {
                double a = stack.pop();
                double b = stack.pop();

                stack.push(b / a);
            } else if (mathChar == '+') {
                double a = stack.pop();
                double b = stack.pop();

                stack.push(b + a);
            } else if (mathChar == '-') {
                double a = stack.pop();
                double b = stack.pop();

                stack.push(b - a);
            }
        }

        System.out.printf("%.2f", stack.pop());
//        System.out.println(String.format("%.2f", stack.pop()));

        br.close();
    }
}
