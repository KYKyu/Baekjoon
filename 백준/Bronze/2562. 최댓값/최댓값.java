import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0, max_index = 0;
		int a;
		
		for (int i = 0; i < 9; i++) {
			a = Integer.parseInt(br.readLine());
			if (max < a) {
				max = a;
				max_index = i;
			}
		}
		
		bw.write(max + "");
		bw.write("\n");
		bw.write(max_index + 1 + "");
		
		bw.flush();
		bw.close();
		br.close();

	}

}