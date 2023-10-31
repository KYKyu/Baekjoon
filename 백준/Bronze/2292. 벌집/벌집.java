import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0, mul = 0;
		int num = 1;
		if(N == 1) {
			bw.write(1 + "");
			bw.flush();
			bw.close();
			br.close();
			System.exit(0);
		}
		while(true) {
			if(num == (6 * count + 2)) {
				mul++;
				count += mul;
			}
			if(num == N) {
				bw.write(mul + 1 + "");
				break;
			}
			num++;
		}
		bw.flush();
		bw.close();
		br.close();

	}

}