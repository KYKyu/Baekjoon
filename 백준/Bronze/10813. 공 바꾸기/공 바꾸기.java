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
		for(int i = 0; i < N; i++) {
			array[i] = i + 1;
		}
		int a, b, temp;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken()) - 1;
			b = Integer.parseInt(st.nextToken()) - 1;
			temp = array[a];
			array[a] = array[b];
			array[b] = temp;
		}
		
		for(int i = 0; i < N; i++) {
			bw.write(array[i] + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}