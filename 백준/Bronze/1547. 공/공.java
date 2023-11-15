import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		int ball = 1;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()),
					b = Integer.parseInt(st.nextToken());
			if(ball == a) {
				ball = b;
			}
			else if(ball == b) {
				ball = a;
			}
				
			
		}
		
		bw.write(ball + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
