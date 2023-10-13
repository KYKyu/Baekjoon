import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] array = new int[26];
		for(int i = 0; i < 26; i++) {
			array[i] = -1;
		}
		int index = 0;
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			int c = (int)str.charAt(i) - 97;
			if(array[c] == -1) {
				array[c] = index;
			}
			index++;
		}
		
		for (int i = 0; i < 26; i++) {
			bw.write(array[i] + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
