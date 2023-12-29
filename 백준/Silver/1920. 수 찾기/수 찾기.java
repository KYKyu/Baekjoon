import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		HashMap<String, Boolean> hm = new HashMap<String, Boolean>();
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			hm.put(st.nextToken(), false);
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] result = new int[M];
		
		st = new StringTokenizer(br.readLine());		
		for(int i = 0; i < M; i++) {
			if(hm.get(st.nextToken()) != null) {
				result[i] = 1;
			}
		}
		
		for(int i = 0; i < M; i++) {
			sb.append(result[i]).append("\n");
		}
		
		System.out.println(sb);
		br.close();
		return;
	}

}
