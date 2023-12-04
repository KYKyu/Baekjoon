import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Queue<Integer> que = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder(); 
		int back = 0;
		
		int N = Integer.parseInt(br.readLine());
		String str;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			str = st.nextToken();
			if(str.equals("push")) {
				back = Integer.parseInt(st.nextToken());
				que.add(back);
			}
			else if(str.equals("pop")) {
				if(que.isEmpty()) {
					sb.append("-1\n");
				}
				else {
					sb.append(que.remove() + "\n");
				}
			}
			else if(str.equals("size")) {
				sb.append(que.size() + "\n");
			}
			else if(str.equals("empty")) {
				if(que.isEmpty()) {
					sb.append("1\n");
				}
				else {
					sb.append("0\n");
				}
			}
			else if(str.equals("front")) {
				if(que.isEmpty()) {
					sb.append("-1\n");
				}
				else {
					sb.append(que.peek() + "\n");
				}
				
			}
			else if(str.equals("back")) {
				if(que.isEmpty()) {
					sb.append("-1\n");
				}
				else {
					sb.append(back + "\n");
				}
				
			}
		}
		
		System.out.println(sb);
		return;
		

	}

}