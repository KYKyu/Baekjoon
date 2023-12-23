import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			
			if(str.equals("end")) {
				break;
			}
			
			// 모음이 하나라도 있는지 확인
			if(!str.matches("(.*)[aeiou](.*)")) {
				sb.append("<" + str + "> is not acceptable.\n");
				continue;
			}
			
			// 연속 두번 나오는짖 확인
			boolean flag = true;
			for(int i = 1; i < str.length(); i++) {
				if(str.charAt(i) == str.charAt(i - 1)) {
					if(str.charAt(i) != 'e' && str.charAt(i) != 'o') {
						sb.append("<" + str + "> is not acceptable.\n");
						flag = false;
						break;
					}
				}
			}
			
			if(flag == false) {
				continue;
			}
			
			int aeiou = 0;
			int aeiouNot = 0;
			
			for(int i = 0; i < str.length(); i++) {
				String com = str.charAt(i) + "";
				if(com.matches("(.*)[aeiou](.*)")) {
					aeiouNot = 0;
					aeiou++;			
				}
				else {
					aeiou = 0;
					aeiouNot++;
				}
				if(aeiou >= 3 || aeiouNot >= 3) {
					sb.append("<" + str + "> is not acceptable.\n");
					flag = false;
					break;
				}
			}
			
			if(flag == false) {
				continue;
			}
			
			sb.append("<" + str + "> is acceptable.\n");
		}
		
		System.out.println(sb);
		br.close();
		return;
	}

}