import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> que = new LinkedList<Integer>();
		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N; i++) {
			que.add(i);
		}
		
		int dwC;
		while(que.size() > 1) {
			que.remove();
			if(que.size() > 1) {
				dwC = que.remove();
				que.add(dwC);
			}
			else
				break;
		}
		
		System.out.println(que.peek());
		br.close();
		return;

	}

}
