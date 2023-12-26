import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int[] a = new int[26];

		int len = str.length();
		for(int i = 0; i < len; i++) {
			a[str.charAt(i) - 97]++;
		}
		
		for(int i = 0; i < 26; i++) {
			sb.append(a[i]).append(" ");
		}
		System.out.println(sb);
		return;

	}

}