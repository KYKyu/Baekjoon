import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Integer.parseInt(br.readLine());
		bw.write(N*4 + "");
		bw.flush();
		bw.close();
		br.close();

	}

}
