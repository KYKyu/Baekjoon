import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = new String[3];
		String str_result = "";
		long ab;
		int mul = 0;
		for(int i = 0; i < 3; i++) {
			char a = 0;
			str[i] = br.readLine();
			
			if(str[i].equals("black")) 
				a='0';
			else if(str[i].equals("brown"))
				a='1';
			else if(str[i].equals("red"))
				a='2';
			else if(str[i].equals("orange"))
				a='3';
			else if(str[i].equals("yellow"))
				a='4';
			else if(str[i].equals("green"))
				a='5';
			else if(str[i].equals("blue"))
				a='6';
			else if(str[i].equals("violet"))
				a='7';
			else if(str[i].equals("grey"))
				a='8';
			else if(str[i].equals("white"))
				a='9';
			
			if(i == 2) {
				mul = (int)Math.pow(10, Integer.parseInt(a + ""));
			}

			else 
				str_result += a;
			
		}
		ab = (long)Integer.parseInt(str_result) * mul;
		bw.write(ab + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
