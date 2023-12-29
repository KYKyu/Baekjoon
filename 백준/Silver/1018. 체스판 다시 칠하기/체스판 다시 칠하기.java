import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] arr1 = new String[8];
		String[] arr2 = new String[8];
		int min = 64;
		
		for(int i = 0; i < 8; i++) {
			if(i % 2 == 0) {
				arr1[i] = "BWBWBWBW";
				arr2[i] = "WBWBWBWB";
			}
			else {
				arr1[i] = "WBWBWBWB";
				arr2[i] = "BWBWBWBW";
			}
		}
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[] board = new String[N];
		
		for(int i = 0; i < N; i++) {
			board[i] = br.readLine();
		}
		
		for(int i = 0; i <= N - 8; i++) {
			for(int j = 0; j <= M - 8; j++) {
				int count = 64;
				for(int k = 0; k < 8; k++) {
					for(int l = 0; l < 8; l++) {
						if(board[i + k].charAt(j + l) == arr1[k].charAt(l)) {
							count--;
						}
					}
				}
				if(count < min) {
					min = count;
				}
			}
		}
		
		for(int i = 0; i <= N - 8; i++) {
			for(int j = 0; j <= M - 8; j++) {
				int count = 64;
				for(int k = 0; k < 8; k++) {
					for(int l = 0; l < 8; l++) {
						if(board[i + k].charAt(j + l) == arr2[k].charAt(l)) {
							count--;
						}
					}
				}
				if(count < min) {
					min = count;
				}
			}
		}
		
		System.out.println(min);
		br.close();
		return;
		

	}

}
