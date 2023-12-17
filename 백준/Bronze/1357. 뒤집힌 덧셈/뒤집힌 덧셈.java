import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static String Rev(String num) {
		String str = "";
		
		for(int i = num.length() - 1; i >= 0; i--) {
			str += num.charAt(i);
		}
		
		return str;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.println(Integer.parseInt(Rev(Integer.parseInt(Rev(st.nextToken())) + Integer.parseInt(Rev(st.nextToken())) + "")));
		br.close();
		return;
	}

}