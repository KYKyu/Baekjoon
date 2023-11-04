import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		bw.write((long)Math.abs(Integer.parseInt(st.nextToken()) - (long)Integer.parseInt(st.nextToken())) + "");

		bw.flush();
		bw.close();
		br.close();

	}

}
