import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] array = new int[4];
		for(int i = 0; i < 4; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}

		array[2] = array[2] - array[0];
		array[3] = array[3] - array[1];
		int min = array[0];
		for(int i = 1; i < 4; i++) {
			if(array[i] < min)
				min = array[i];
		}

		System.out.println(min);
		br.close();				
	}

}