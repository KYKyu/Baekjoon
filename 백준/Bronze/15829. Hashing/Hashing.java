import java.io.*;
public class Main {
	
	public static long Hash(String str, int len) {
		long sum = 0;
		for(int i = 0; i < len; i++) {
			sum += (long)((int)(str.charAt(i) - 96) * Math.pow(31, i));
		}
		return sum % 1234567891;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		long sum = Hash(str, len);
		
		System.out.println(sum);

	}

}
