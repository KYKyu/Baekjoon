import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken()), b1 = Integer.parseInt(st.nextToken());
		
		int[][] arr1 = new int[a1][b1];
		for(int i = 0; i < a1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < b1; j++) {
				arr1[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		st = new StringTokenizer(br.readLine());
		int a2 = Integer.parseInt(st.nextToken()), b2 = Integer.parseInt(st.nextToken());
		
		int[][] arr2 = new int[a2][b2];
		for(int i = 0; i < a2; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < b2; j++){
				arr2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] arr_result = new int[a1][b2];
		for(int i = 0; i < a1; i++) {
			for(int j = 0; j < b2; j++) {
				for(int k = 0; k < a2; k++) {
					arr_result[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
		for(int i = 0; i < a1; i++) {
			for(int j = 0; j < b2; j++) {
				bw.write(arr_result[i][j] + " ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		return;
		
	}

}