import java.io.*;
import java.util.StringTokenizer;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum1 = 0, sum2 = 0;
		for(int i = 0; i < 4; i++) {
			sum1 += Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			sum2 += Integer.parseInt(st.nextToken());
		}
		
		if(sum1 > sum2) {
			System.out.println(sum1);
		}
		else {
			System.out.println(sum2);
		}
		
		br.close();
		return;
		
	}
}