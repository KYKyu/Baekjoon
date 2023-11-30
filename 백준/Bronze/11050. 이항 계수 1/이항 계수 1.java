import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int result = 1;
		for(int i = 0; i < b; i++) {
			result *= a;
			a--;
		}
		for(int i = 1; i <= b; i++) {
			result /= i;
		}
		System.out.println(result);
		br.close();
		return;

	}

}