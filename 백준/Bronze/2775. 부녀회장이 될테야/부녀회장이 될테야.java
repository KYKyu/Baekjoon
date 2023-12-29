import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][] a = new int[15][15];
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i <= 14; i++) {
			a[0][i] = i + 1;
		}
		
		for(int i = 1; i <= 14; i++) {
			for(int j = 0; j <= 14; j++) {
				for(int k = 0; k <= j; k++) {
					a[i][j] += a[i-1][k];
				}
			}
		}
		
		while(N-- > 0) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			sb.append(a[k][n-1]).append("\n");
		}
		
		System.out.println(sb);
		br.close();

	}

}
