import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0, m_index = 0, sum = 0;;
		
		for(int i = 0; i < 3; i++) {
			if(max < a[i]) {
				max = a[i];
				m_index = i;
			}	
		}
		for(int i = 0; i < 3; i++) {
			if(i == m_index) {
				continue;
			}
			sum += a[i];
		}
		
		if(sum <= max) 
			sum += sum - 1;
		else
			sum += max;
		
		bw.write(sum + "");
		bw.flush();
		bw.close();
		br.close();
		

	}

}
