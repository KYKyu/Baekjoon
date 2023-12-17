import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] check_row = new int[N];
		int[] check_col = new int[M];
		
		int count = 0;
		
		String str;
		for(int i = 0; i < N; i++) {
			str = br.readLine();
			for(int j = 0; j < M; j++) {
				if(str.charAt(j) == 'X') {
					check_row[i] = 1;
					check_col[j] = 1;
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(check_row[i] == 0 && check_col[j] == 0) {
					check_row[i] = 1;
					check_col[j] = 1;
					count++;
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(check_row[i] == 0) {
					check_row[i] = 1;
					count++;
				}
				if(check_col[j] == 0) {
					check_col[j] = 1;
					count++;;
				}
			}
		}
		
		System.out.println(count);
		
		br.close();
		return;		

	}

}