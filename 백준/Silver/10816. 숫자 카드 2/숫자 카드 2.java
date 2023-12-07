import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int key, count;
		for(int i = 0; i < N; i++) {
			key = Integer.parseInt(st.nextToken());
			if(hm.containsKey(key)) {
				count = hm.get(key) + 1;
				hm.put(key, count);
			}
			else {
				hm.put(key, 1);
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < M; i++) {
			key = Integer.parseInt(st.nextToken());
			if(hm.containsKey(key)) {
				bw.write(hm.get(key) + " ");
			}
			else {
				bw.write(0 + " ");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
		return;
		

	}

}
