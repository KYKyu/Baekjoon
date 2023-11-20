import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		if(N < 100) {
			System.out.println(N);
			System.exit(0);
		}
		
		for(int i = 1; i < 10; i++) {
			int a = 0;
			for(int j = 0; j < 5; j++) {
				if(i + j*2 >= 10) {
					break;
				}
				a = i*100 + (i+j)*10 + (i+2*j);
				if(a > N) {
					break;
				}
				count++;
			}
			for(int j = 1; j < 5; j++) {
				if(i - 2*j < 0) {
					break;
				}
				a = i*100 + (i-j)*10 + (i-2*j);
				if(a > N) {
					continue;
				}
				count++;
			}
		}
		System.out.println(99 + count + "");
		br.close();
	}
}