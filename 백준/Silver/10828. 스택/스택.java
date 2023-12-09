import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stackInt = new Stack<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		
		String str;
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			
			str = st.nextToken();
			if(str.equals("push")) {
				stackInt.push(Integer.parseInt(st.nextToken()));
				
			}
			else if(str.equals("pop")) {
				if(stackInt.isEmpty()) {
					sb.append(-1 + "\n");
				}
				else {
					sb.append(stackInt.pop() + "\n");
				}
			}
			else if(str.equals("size")) {
				sb.append(stackInt.size() + "\n");
			}
			else if(str.equals("empty")) {
				if(stackInt.isEmpty()) {
					sb.append(1 + "\n");
				}
				else {
					sb.append(0 + "\n");
				}
			}
			else if(str.equals("top")){
				if(stackInt.isEmpty()) {
					sb.append(-1 + "\n");
				}
				else {
					sb.append(stackInt.peek() + "\n");
				}
			}
		}
		System.out.println(sb);
		br.close();
		return;
	}

}
