import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[26];
		
		String str = br.readLine();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 65 && c <= 90) {
				array[c - 65]++;
			}
			else if(c >= 97 && c <= 122) {
				array[c - 97]++;
			}
		}
		
		int max = array[0], max_index = 0;
		for(int i = 1; i < 26; i++) {
			if(max < array[i]) {
				max = array[i];	
				max_index = i;
			}
		}
		int count = 0;
		for(int i = 0; i < 26; i++) {
			if(array[i] == max)
				count++;
			if(count == 2) {
				bw.write("?");
				bw.flush();
				bw.close();
				br.close();
				
				System.exit(0);
			}
		}

		bw.write((char)(max_index + 65));
		bw.flush();
		bw.close();
		br.close();
	}

}