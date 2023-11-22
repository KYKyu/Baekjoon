import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String num = br.readLine();
			if(num.equals("0")) {
				break;
			}
			int count=0;
			
			for(int i = 0; i < num.length();i++) {
				if(num.charAt(i) == '1') {
					count += 2;
				}
				else if(num.charAt(i) == '0') {
					count += 4;
				}
				else {
					count += 3;
				}
			}
			
			System.out.println(count + 2 + num.length() - 1);
			
		}

	}

}