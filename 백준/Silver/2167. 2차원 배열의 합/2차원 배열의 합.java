import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int K = Integer.parseInt(br.readLine());
		for(int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int sum = 0;	
			int a = Integer.parseInt(st.nextToken()),
					b = Integer.parseInt(st.nextToken()),
					x = Integer.parseInt(st.nextToken()),
					y = Integer.parseInt(st.nextToken());
			for(int j = a-1; j < x; j++) {
				for(int l = b-1; l < y; l++) {
					sum += arr[j][l];
				}
			}
			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
		
		

	}

}