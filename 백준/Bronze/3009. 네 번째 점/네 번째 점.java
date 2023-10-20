import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] array = new int[4];
		
		st = new StringTokenizer(br.readLine());
		array[0] = Integer.parseInt(st.nextToken());
		array[1] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		array[2] = Integer.parseInt(st.nextToken());
		array[3] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if(array[0] == array[2]) {
			bw.write(a + " ");
		}
		else if(array[0] == a)
			bw.write(array[2] + " ");
		else if(array[2] == a)
			bw.write(array[0] + " ");
		
		if(array[1] == array[3]) {
			bw.write(b + " ");
		}
		else if(array[1] == b)
			bw.write(array[3] + "");
		else if(array[3] == b)
			bw.write(array[1] + "");

		bw.flush();
		bw.close();
		br.close();

	}

}