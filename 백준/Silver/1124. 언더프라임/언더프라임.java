import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int count_up = 0;
		
		for(int i = A; i <= B; i++) {
			int div = i;
			int count = 0;
			for(int j = 2; div > 1;) {
				if(div % j == 0) {
					div /= j;
					count++;
				}
				else {
					j++;
				}
			}
			
			if(count == 1) {
				continue;
			}
			
			int a = (int)Math.sqrt(count);
			int isSosu = 1;
			for(int j = 2; j <= a; j++) {
				if(count % j == 0) {
					isSosu = 0;
					break;
				}
			}
			
			if(isSosu == 1) {
				count_up++;
			}
		}
		System.out.println(count_up);
		br.close();
		return;
	}

}