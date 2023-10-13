import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		double max = 0;
		double[] array = new double[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if(array[i] > max)
				max = array[i];
		}
		for(int i = 0; i < N; i++) {
			array[i] = array[i] / max * 100;
		}
		double sum = 0;
		for(int i = 0; i < N; i++) {
			sum += array[i];
		}
		
		bw.write(sum/N + "");
		bw.flush();
		bw.close();
		br.close();		

	}

}
