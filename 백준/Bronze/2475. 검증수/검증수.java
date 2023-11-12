import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 0;
		for(int i = 0; i < 5; i++) {
			result += Math.pow(Integer.parseInt(st.nextToken()), 2);
		}
		bw.write(result % 10 + "");
		bw.flush();
		bw.close();
		br.close();

	}

}
