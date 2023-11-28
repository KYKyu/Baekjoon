import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = st.countTokens();
		int a = Integer.parseInt(st.nextToken());
		int count = 1;
		if(a == 1) {
			for(int i = 0; i < n - 1; i++) {
				if(Integer.parseInt(st.nextToken()) != ++a) {
					System.out.println("mixed");
					break;
				}
				count++;
			}
			if(count == n) {
				System.out.println("ascending");
			}
		}
		else if(a == 8) {
			for(int i = 0; i < n - 1; i++) {
				if(Integer.parseInt(st.nextToken()) != --a) {
					System.out.println("mixed");
					break;
				}
				count++;
			}
			if(count == n) {
				System.out.println("descending");
			}
		}
		else {
			System.out.println("mixed");
		}
		br.close();
		return;

	}

}
