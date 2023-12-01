import java.io.*;
public class Main {
	static final int M = 1234567891;
	
	public static long Hash(String str, int len) {
		long sum = 0;
		long pow = 1;
		for(int i = 0; i < len; i++) {
			sum = (sum + (long)((long)(str.charAt(i) - 96) * pow)) % M;
			pow = pow * 31 % M;
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		long sum = Hash(str, len);
		
		System.out.println(sum);
		br.close();
		return;

	}

}
