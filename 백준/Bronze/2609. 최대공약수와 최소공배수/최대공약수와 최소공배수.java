import java.io.*;
import java.util.StringTokenizer;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int div = gcd(a, b);
		
		System.out.println(div);
		System.out.println(a * b / div);
		
		br.close();
		return;
		
	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			
			a = b;
			b = r;
		}
		return a;
	}

}
