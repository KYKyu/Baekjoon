import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());
		N = N / 100;
		String str = N + "00";
		N = Integer.parseInt(str);
		for(int i = 0; i < 100; i++) {
			if(N % F == 0) {
				pw.printf("%02d", i);
				break;
			}
			N++;
		}
		pw.flush();
		pw.close();
		br.close();
		
		
	}

}
