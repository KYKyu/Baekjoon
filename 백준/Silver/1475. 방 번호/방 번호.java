import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[10];
		String N = br.readLine();

		for(int i = 0; i < N.length(); i++) {
			arr[Integer.parseInt(N.charAt(i)+"")]++;
		}
		if((arr[6] + arr[9]) % 2 != 0) {
			arr[6] = (arr[6] + arr[9])/2 + 1;
			arr[9] = 0;
		}
		else {
			arr[6] = (arr[6] + arr[9])/2;
			arr[9] = 0;
		}
		int max = 0;
		for(int i = 0; i < 10; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		bw.write(max + "");
		bw.flush();
		bw.close();
		br.close();

	}

}