import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String str = br.readLine();
			int count = 1;
			int sum = 0;
			if(str.charAt(0) == 'O') {
				sum += count;
			}
			for(int j = 1; j < str.length(); j++) {
				if(str.charAt(j) == 'O') {
					if(str.charAt(j-1) == 'O') {
						count++;
					}
					else {
						count = 1;
					}
					sum += count;
				}
			}
			System.out.println(sum);
		}
		
		br.close();
		return;

	}

}
