import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int count;
		String str;
		while(N-->0) {
			count = 0;
			str = br.readLine();
			if(str.length() % 2 != 0) {
				sb.append("NO\n");
				continue;
			}
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ')') {
					count--;
					if(count < 0) {
						break;
					}
				}
				else if(str.charAt(i) == '(') {
					count++;
				}
			}
			if(count == 0) {
				sb.append("YES\n");
			}
			else {
				sb.append("NO\n");
			}
		}
		System.out.println(sb);
		br.close();
		return;

	}

}
