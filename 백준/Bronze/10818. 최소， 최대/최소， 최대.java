import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int max = Integer.parseInt(st.nextToken()), min = max;
		int a;
		for (int i = 1; i < N; i++) {
			a = Integer.parseInt(st.nextToken());
			if(max < a)
				max = a;
			else if(min > a)
				min = a;
		}
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
		br.close();
	}
	
}