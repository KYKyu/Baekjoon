import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = new String[5];
		int max_length = 1;
		
		for(int i = 0; i < 5; i++) {
			str[i] = br.readLine();
			if(max_length < str[i].length())
				max_length = str[i].length();
		}
		
		for(int i = 0; i < max_length; i++) {
			for(int j = 0; j < 5; j++) {
				if(str[j].length() <= i)
					continue;
				bw.write(str[j].charAt(i));
			}
			
		}
		
		bw.flush();
		bw.close();
		br.close();

	}

}