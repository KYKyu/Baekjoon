import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine()), count = 0;
		
		for(int i = 0; i < N; i++) {
			int[] alp = new int[26];
			String str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				if(alp[str.charAt(j) - 97] != 0) {
					break;
				}
				else if(j == str.length() - 1) {
					count++;
					break;
				}
				if(str.charAt(j) == str.charAt(j+1))
					continue;
				else
					alp[str.charAt(j) - 97] = 1;
			}			
		}
		
		bw.write(count + "");
		bw.flush();
		bw.close();
		br.close();
		

	}

}