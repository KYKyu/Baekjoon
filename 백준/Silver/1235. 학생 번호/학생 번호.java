import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 1;
		
		String[] str = new String[N];
		
		for(int i = 0; i < N; i++) {
			str[i] = br.readLine();
		}
		
		int str_length = str[0].length();
		int goNext = 0, good = 1;
		
		String[] com = new String[N];
		
		for(int num = str_length - 1; num >= 0 ; num--) {
			for(int i = 0; i < N; i++) {
				com[i] = str[i].charAt(num) + com[i];
			}
			for(int i = 0; i < N - 1; i++) {
				for(int j = i + 1; j < N; j++) {
					if(com[i].equals(com[j])) {
						count++;
						goNext = 1;
						good = 0;
						break;
					}
				}
				if(goNext == 1) {
					goNext = 0;
					break;
				}
			}
			if(good == 1) {
				break;
			}
			else {
				good = 1;
			}
		}
		
		System.out.println(count);
		br.close();
		return;
		
		

	}

}