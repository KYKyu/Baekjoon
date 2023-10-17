import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < (N*2 -1) / 2 + 1; i++) {
			for(int j = 1; j <= N*2 -1; j++) {
				if(j < (N*2 -1) / 2 + 1 - i) {
					bw.write(" ");
				}
				else if(j > (N*2 -1) / 2 + 1 + i) {
					break;
				}
				else
					bw.write("*");
			}
			bw.write("\n");
		}
		for(int i = 1; i < (N*2 -1)/2 + 1; i++) {
			for(int j = 1; j<=N*2 -1 ; j++) {
				if(j <= i)
					bw.write(" ");
				else if (j >= (N*2-1) + 1 - i) {
					break;
				}
				else
					bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}