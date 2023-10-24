import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);			
			
			if(c >= 65 && c <= 67)
				count += 3;
			else if(c >= 68 && c <= 70)
				count += 4;
			else if(c >= 71 && c <= 73)
				count += 5;
			else if(c >= 74 && c <= 76)
				count += 6;
			else if(c >= 77 && c <= 79)
				count += 7;
			else if(c >= 80 && c <= 83)
				count += 8;
			else if(c >= 84 && c <= 86)
				count += 9;
			else if(c >= 87 && c <= 90)
				count += 10;			
		}
		bw.write(count + "");
		bw.flush();
		bw.close();
		br.close();
				

	}

}