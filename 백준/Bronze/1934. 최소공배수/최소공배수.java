import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayList<Integer> array = new ArrayList<>();
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()),
					b = Integer.parseInt(st.nextToken());
			int min;
			if(a > b)
				min = b;
			else
				min = a;
			
			int div = 2;
			while(true) {
				if(a > b)
					min = b;
				else
					min = a;
				if(min < div) {
					array.add(a);
					array.add(b);
					break;
				}
				if((a % div == 0) && (b % div == 0)) {
					a /= div;
					b /= div;
					array.add(div);
				}
				else
					div++;
			}
			int mul = 1;
			for(int j = 0; j < array.size(); j++) {
				mul *= array.get(j);
			}
			bw.write(mul + "\n");
			array.clear();
		}
		bw.flush();
		bw.close();
		br.close();

	}

}
