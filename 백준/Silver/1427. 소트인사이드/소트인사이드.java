import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int[] array = new int[str.length()];
		for(int i = 0; i < str.length(); i++) {
			array[i] = Integer.parseInt(str.charAt(i) + "");
		}
		
		int max, temp, max_index;
		for(int i = 0; i < str.length(); i++) {
			max = array[i];
			max_index = i;
			for(int j = i; j < str.length(); j++) {
				if(max < array[j]) {
					max = array[j];
					max_index = j;
				}
			}
			if(max_index != i) {
				temp = array[i];
				array[i] = max;
				array[max_index] = temp;
			}
		}
		for(int i = 0; i < str.length(); i++) {
			bw.write(array[i] + "");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}