import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        while(K-- > 0){
            int in = Integer.parseInt(br.readLine());
            if(in == 0){
                stack.pop();
            }
            else{
                stack.add(in);
            }
        }

        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }

        System.out.println(sum);

        br.close();
        return;
    }
}