import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int mul = a * b * c;
		
		int[] arr = new int[10];
		String str = mul + "";
		
		
		for(int i = 0; i < str.length(); i++) {
			arr[Integer.parseInt(str.charAt(i) + "")]++;
		}
		
		for(int i = 0; i < 10; i++) {
			bw.write(arr[i] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
		return;

	}

}