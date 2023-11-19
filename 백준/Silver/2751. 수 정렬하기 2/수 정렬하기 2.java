import java.io.*;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		arr.sort(null);
		for(int i = 0; i < N; i++) {
			bw.write(arr.get(i) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();

	}

}
