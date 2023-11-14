import java.io.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int idx = N;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			arr.add(i);
		}

		for(int i = 1; i <= idx; i++) {
			if(i % 2 == 0) {
				arr.add(arr.get(i-1));
				idx++;
			}
			else {
				bw.write(arr.get(i-1) + " ");
				bw.flush();
			}
		}
		bw.flush();
		bw.close();
		br.close();
			
	}

}
