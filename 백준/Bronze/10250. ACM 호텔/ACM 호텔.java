import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int YY = 0;
			int XX = 1;
			
			for(int j = 0; j < N; j++) {
				YY++;
				if(YY > H) {
					YY = 1;
					XX++;
				}
				
			}
			
			if(YY < 10) {
				bw.write(String.format("%d", YY) + String.format("%02d", XX) + "\n");
			}
			else {
				bw.write(String.format("%02d", YY) + String.format("%02d", XX) + "\n");
			}
			
		}
		bw.flush();
		bw.close();
		br.close();
		return;

	}

}