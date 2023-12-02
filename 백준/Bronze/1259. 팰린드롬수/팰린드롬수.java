import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str1 = br.readLine();
			if(str1.equals("0")) {
				break;
			}
			String str2 = "";
			for(int i = str1.length() - 1; i >= 0; i--) {
				str2 = str2 + str1.charAt(i);
			}
			if(str1.equals(str2)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			
		}
		br.close();
		return;
	}

}