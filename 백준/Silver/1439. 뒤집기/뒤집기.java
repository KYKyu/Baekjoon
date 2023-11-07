import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int a = 0, b = 0, min;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == '1' && str.charAt(i - 1) == '0') {
				a++;
			}
			else if(str.charAt(i) == '0' && str.charAt(i - 1) == '1') {
				b++;
			}
		}
		if(str.charAt(str.length() - 1) == '0') {
			a++;
		}
		else {
			b++;
		}
		
		if(a > b) {
			min = b;
		}
		else {
			min = a;
		}
		bw.write(min + "");
		bw.flush();
		bw.close();
		br.close();

	}

}