import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine()),
				b = Integer.parseInt(br.readLine()),
				c = Integer.parseInt(br.readLine());
		
		if((a+b+c) == 180) {
			if (a == b && b == c && a == c)
				bw.write("Equilateral");
			else if (a != b && a != c && b != c)
				bw.write("Scalene");
			else
				bw.write("Isosceles");
		}
		else
			bw.write("Error");
		bw.flush();
		bw.close();
		br.close();
	}

}
