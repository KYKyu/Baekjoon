import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int[] array = new int[4];
			int C = Integer.parseInt(br.readLine());
			
			array[0] = C/25;
			C = C - 25 * array[0];
			array[1] = C/10;
			C = C - 10 * array[1];
			array[2] = C/5;
			C = C - 5 * array[2];
			array[3] = C;
			
			for(int j = 0; j < 4; j++)
				bw.write(array[j] + " ");
			bw.write("\n");
		}
		
		
		bw.flush();
		bw.close();
		br.close();

	}

}