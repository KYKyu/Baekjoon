import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] cards = new int[N];
		for(int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		int near = 0;
		for(int i = 0; i < N-2; i++) {
			for(int j = i+1; j < N-1; j++) {
				for(int k = j+1; k < N; k++) {
					int sum = cards[i] + cards[j] + cards[k];
					if(sum == M) {
						System.out.println(sum);
						br.close();
						return;
					}
					if((sum - near > 0) && M >= sum) {
						near = sum;
					}
				}
			}
		}
		System.out.println(near);
		br.close();
		return;
	}

}