import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int[] arrayA, arrayB;
		int N = Integer.parseInt(br.readLine());
		int temp, m, m_idx;
		arrayA = new int[N];
		arrayB = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arrayA[i] = Integer.parseInt(st.nextToken());
		}
		
		

		for(int i = 0; i < N; i++) {
			m = arrayA[i];
			m_idx = i;
			for(int j = i; j < N; j++) {
				if(arrayA[j] > m) {
					m = arrayA[j];
					m_idx = j;
				}
			}
			temp = arrayA[i];
			arrayA[i] = arrayA[m_idx];
			arrayA[m_idx] = temp;
			
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arrayB[i] = Integer.parseInt(st.nextToken());
		}
		
		

		for(int i = 0; i < N; i++) {
			m = arrayB[i];
			m_idx = i;
			for(int j = i; j < N; j++) {
				if(arrayB[j] < m) {
					m = arrayB[j];
					m_idx = j;
				}
			}

			temp = arrayB[i];
			arrayB[i] = arrayB[m_idx];
			arrayB[m_idx] = temp;
			
		}
		
		int s = 0;
		for(int i = 0; i < N; i++) {
			s += arrayA[i] * arrayB[i];
		}
		
		bw.write(s + "");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
