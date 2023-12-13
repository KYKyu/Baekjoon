import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int a;
		for(int i = 0; i < 5; i++) {
			a = Integer.parseInt(br.readLine());
			if(a < 40) {
				sum+=40;
			}
			else {
				sum+=a;
			}
			
		}
		
		System.out.println(sum/5);
		br.close();
		return;
	}

}
