import java.io.*;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> array = new ArrayList<>();
		
		while(true) {
			int N = Integer.parseInt(br.readLine());
			int sum = 0; // 완전수인지 확인하기 위해 다 더해줌
			
			if(N == -1) // -1이 들어오면 중지
				break;
			for(int i = 1; i < N; i++) {
				if(N % i == 0) {
					sum += i;
					array.add(i);
				}
			}
			if(sum == N) {
				bw.write(N + " = " + array.get(0));
				for(int i = 1; i < array.size(); i++) {
					bw.write(" + " + array.get(i));
				}
			}
			else {
				bw.write(N + " is NOT perfect.");
			}
			bw.write("\n");
			array.clear();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}