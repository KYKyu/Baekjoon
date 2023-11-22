import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int idx = 0;
		while(true) {
			if(arr[idx] < X) {
				System.out.println(idx + 1);
				break;
			}
			
			if(++idx >= N) {
				idx = 0;
			}
			
			X++;
		}
		br.close();
		return;
		
	}

}
