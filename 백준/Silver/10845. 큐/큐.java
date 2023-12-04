import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	static Queue<Integer> que = new LinkedList<Integer>();
	static StringBuilder sb = new StringBuilder();
	static int back = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("push")) {
				push(Integer.parseInt(st.nextToken()));
			}
			else if(str.equals("pop")) {
				pop();
			}
			else if(str.equals("size")){
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
		
		return;

	}
	
	static void push(int a) {
		back = a;
		que.add(a);
	}
	
	static void pop() {
		if (que.isEmpty()) {
            sb.append("-1\n");
        } else {
            sb.append(que.remove() + "\n");
        }
	}
	
	static void size() {
		sb.append(que.size() + "\n");
	}
	
	static void empty() {
		if(que.isEmpty()) {
			sb.append("1\n");
		}
		else {
			sb.append("0\n");
		}
	}
	
	static void front() {
		if(que.isEmpty()) {
			sb.append("-1\n");
		}
		else {
			sb.append(que.peek() + "\n");
		}
	}
	
	static void back() {
		if(que.isEmpty()) {
			sb.append("-1\n");
		}
		else {
			sb.append(back + "\n");
		}
	}

}