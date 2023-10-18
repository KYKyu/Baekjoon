import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken());
			int c = 0;
			for(int j = 1; j <= a; j++) {
				if(a % j == 0)
					c++;
			}
			if(c == 2)
				count++;
		}
		bw.write(count + "");
		bw.close();
		br.close();
	}
}