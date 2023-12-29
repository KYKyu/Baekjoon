import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
public class Main {
	
	static Deque<Integer> dq = new ArrayDeque<Integer>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			String str;
			st = new StringTokenizer(br.readLine());
			str = st.nextToken();
			if(str.equals("push_front")) {
				push_front(Integer.parseInt(st.nextToken()));
			}
			else if(str.equals("push_back")) {
				push_back(Integer.parseInt(st.nextToken()));
			}
			else if(str.equals("pop_front")) {
				pop_front();
			}
			else if(str.equals("pop_back")) {
				pop_back();				
			}
			else if(str.equals("size")) {
				size();				
			}
			else if(str.equals("empty")) {
				empty();
			}
			else if(str.equals("front")) {
				front();
			}
			else if(str.equals("back")) {
				back();
			}
		}
		System.out.println(sb);
		br.close();
		return;		

	}
	
	static void push_front(int n) {
		dq.addFirst(n);
	}
	static void push_back(int n) {
		dq.addLast(n);
	}
	static void pop_front() {
		if(!dq.isEmpty()) {
			sb.append(dq.removeFirst()).append("\n");
		}
		else {
			sb.append(-1).append("\n");
		}
	}
	static void pop_back() {
		if(!dq.isEmpty()) {
			sb.append(dq.removeLast()).append("\n");
		}
		else {
			sb.append(-1).append("\n");
		}
	}
	static void size() {
		sb.append(dq.size()).append("\n");
	}
	static void empty() {
		if(!dq.isEmpty()) {
			sb.append(0).append("\n");
		}
		else {
			sb.append(1).append("\n");
		}
	}
	static void front() {
		if(!dq.isEmpty()) {
			sb.append(dq.getFirst()).append("\n");
		}
		else {
			sb.append(-1).append("\n");
		}
	}
	static void back() {
		if(!dq.isEmpty()) {
			sb.append(dq.getLast()).append("\n");
		}
		else {
			sb.append(-1).append("\n");
		}
	}
	
}