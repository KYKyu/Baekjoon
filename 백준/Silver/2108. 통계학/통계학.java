import java.io.*;
import java.util.Arrays;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] plus = new int[4001];
        int[] minus = new int[4001];
        int sum = 0;
        int min = 0, max = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (i == 0) {
                max = arr[0];
                min = arr[0];
            } else {
                if (max < arr[i]) {
                    max = arr[i];
                }
                if(min > arr[i]) {
                    min = arr[i];
                }
            }
            if(arr[i] >= 0) {
                plus[arr[i]]++;
            } else {
                minus[Math.abs(arr[i])]++;
            }
            sum += arr[i];
        }

        int mostMany = 0;
        for(int i = 0; i < 4001; i++) {
            if(plus[i] >= minus[i]) {
                if(plus[i] > mostMany) {
                    mostMany = plus[i];
                }
            } else {
                if(minus[i] > mostMany) {
                    mostMany = minus[i];
                }
            }
        }

        int count = 0;
        for(int i = 4000; i >= 0; i--) {
            if(plus[i] == mostMany) {
                stack.push(i);
                count++;
            }
        }
        for(int i = 1; i < 4001; i++) {
            if(minus[i] == mostMany) {
                stack.push(-i);
                count++;
            }
        }

        Arrays.sort(arr);

        int div = (int)Math.round((double)sum / N);
        int middle = arr[(N - 1) / 2];
        int range = max - min;

        sb.append(div).append("\n").append(middle).append("\n");
        if(count > 1) {
            stack.pop();
            sb.append(stack.pop()).append("\n");
        } else if (count == 1) {
            sb.append(stack.pop()).append("\n");
        }

        sb.append(range);
        System.out.println(sb);
        br.close();

    }
}
