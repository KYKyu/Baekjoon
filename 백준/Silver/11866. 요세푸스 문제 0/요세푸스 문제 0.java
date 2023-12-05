import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		if(N == 1) {
			System.out.println("<1>");
			return;
		}
		int count;
		int[] arr = new int[N];
		int[] res = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		
		int j = 0;
		
		for(int i = 0; i < N; i++) {
			count = K;
			while(true) {
				if(arr[j] != 0) {
					count--;
					if(count <= 0) {
						break;
					}
					j++;
					if(j >= N) {
						j = j % N;
					}
				}
				else {
					j++;
					if(j >= N) {
						j = j % N;
					}
				}
			}
			res[i] = arr[j];
			arr[j] = 0;
			
		}
		
		bw.write("<");
		bw.write(res[0] + ", ");
		for(int i = 1; i < N - 1; i++) {
			bw.write(res[i] + ", ");
		}
		bw.write(res[N-1] + ">");
		bw.flush();
		bw.close();
		br.close();
		
		return;
		

	}

}
