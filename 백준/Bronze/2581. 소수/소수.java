import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine()),
				N = Integer.parseInt(br.readLine());
		int min = -1, sum = 0;
		for(int i = N; i >= M; i--) {
			if(i == 1)
				continue;
			int count = 0;
			double a = Math.sqrt(i);
			for(int j = 1; j <= a; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 1) {
				min = i;
				sum += i;
			}
		}
		if(min != -1) 
			bw.write(sum + "\n" + min);
		else
			bw.write(-1 + "");
		
		bw.flush();
		bw.close();
		br.close();

	}

}