import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int a;
		int max = 0;
		int max_r = 0, max_c = 0;
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				a = Integer.parseInt(st.nextToken());
				if(a > max) {
					max = a;
					max_r = i;
					max_c = j;
				}
			}
		}
		bw.write(max + "\n");
		bw.write(++max_r + " " + ++max_c);
		bw.flush();
		bw.close();
		br.close();
	}

}
