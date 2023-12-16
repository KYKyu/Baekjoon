import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static int StoI(String str) {
		return Integer.parseInt(str);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = StoI(st.nextToken());
		int m = StoI(st.nextToken());
		int M = StoI(st.nextToken());
		int T = StoI(st.nextToken());
		int R = StoI(st.nextToken());
		
		int count = 0;
		int cur_m = m;
		
		if(m + T > M) {
			System.out.println(-1);
			return;
		}
		
		while(N > 0) {
			if(cur_m + T <= M) {
				cur_m += T;
				count++;
				N--;
			}
			else {
				cur_m -= R;
				if(cur_m < m) {
					cur_m = m;
				}
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
		return;
	}

}
