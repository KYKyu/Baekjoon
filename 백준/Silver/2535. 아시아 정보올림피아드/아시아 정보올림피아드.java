import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][3];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return o2[2]-o1[2];
			}
		});
		
		int dong = 2;
		if(arr[0][0] == arr[1][0]) {
			for(int i = 0; i < N; i++) {
				if(arr[i][0] != arr[0][0]) {
					dong = i;
					break;
				}
			}
		}
		
		sb.append(arr[0][0] + " " + arr[0][1] + "\n");
		sb.append(arr[1][0] + " " + arr[1][1] + "\n");
		sb.append(arr[dong][0] + " " + arr[dong][1]);
		
		System.out.println(sb);
		br.close();
		return;
		
		

	}

}