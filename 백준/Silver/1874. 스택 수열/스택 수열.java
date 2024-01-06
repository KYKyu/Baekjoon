import java.io.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int insert = 1;
        boolean flag = false;
        int a = 0;
        while(n > 0){
            if(flag == false){
                a = Integer.parseInt(br.readLine());
                flag = true;
            }

            if(stack.isEmpty()){
                stack.push(insert);
                insert++;
                sb.append("+\n");
                continue;
            }

            if(stack.peek() == a){
                stack.pop();
                sb.append("-\n");
                n--;
                flag = false;
            }
            else if(stack.peek() < a){
                stack.push(insert);
                insert++;
                sb.append("+\n");
            }
            else{
                System.out.println("NO");
                br.close();
                return;
            }

        }

        System.out.println(sb);
        br.close();
        return;
    }
}