import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] array = new int[100][100];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()) - 1,
					 y = Integer.parseInt(st.nextToken()) - 1;
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k < 10; k++) {
					array[x + j][y + k] = 1;
				}
			}
		}
		
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				sum += array[i][j];
			}
		}
		
		bw.write(sum + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
