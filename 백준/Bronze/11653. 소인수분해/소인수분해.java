import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int i = 2;
		while(true) {
			if(N == 1) {
				break;
			}
			if(N % i == 0) {
				N = N / i;
				bw.write(i + "\n");
			}
			else {
				i++;
			}
		}
		bw.flush();
		bw.close();
		br.close();

	}

}