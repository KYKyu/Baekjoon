import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int sum = 0;

		String str = br.readLine();
		String[] str_array = str.split("");
		
		for(int i = 0; i < N; i++) {
			sum = sum + Integer.parseInt(str_array[i]);
		}
			
		
		bw.write(sum + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
