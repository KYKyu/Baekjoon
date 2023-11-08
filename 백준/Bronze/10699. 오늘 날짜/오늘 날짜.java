import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("2023-11-08");
		bw.flush();
		bw.close();

	}

}
