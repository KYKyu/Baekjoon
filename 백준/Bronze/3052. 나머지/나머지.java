import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = 42;
		}
		
		int a, count = 0, idx_count = 0;;
		
		for(int i = 0; i < 10; i++) {
			count = 0;
			a = Integer.parseInt(br.readLine()) % 42;
			for(int j = 0; j < 10; j++) {
				if(array[j] == a)
					count++;
			}
			if(count == 0) {
				array[idx_count] = a;
				idx_count++;
			}
		}
		
		count = 0;
		
		for(int i = 0; (i < 10) && (array[i] < 42); i++) {
			count++;
		}
		bw.write(count +"");
		bw.flush();
		bw.close();
		br.close();
	}

}