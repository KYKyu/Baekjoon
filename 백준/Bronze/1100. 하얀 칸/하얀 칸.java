import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		for(int i = 0; i < 8; i++) {
			String str = br.readLine();
			for(int j = 0; j < 8; j++) {
				if(i % 2 == 0) {
					if(j % 2 == 0) {
						if(str.charAt(j) == 'F') {
							count++;
						}
					}
				}
				else {
					if(j % 2 == 1) {
						if(str.charAt(j) == 'F') {
							count++;
						}
					}
				}
				
			}
			
		}
		System.out.println(count);
		br.close();
		return;

	}

}