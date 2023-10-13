import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] array = new int[N];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			for(int j = s - 1; j < e; j++) {
				array[j] = p;
			}
		}
		
		for(int i = 0; i < N; i++) {
			bw.write(array[i] + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}