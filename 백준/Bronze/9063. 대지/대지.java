import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int xMax, xMin, yMax, yMin;
		st = new StringTokenizer(br.readLine());
		xMax = xMin = Integer.parseInt(st.nextToken());
		yMax = yMin = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(xMax < a)
				xMax = a;
			else if(xMin > a)
				xMin = a;
			if(yMax < b)
				yMax = b;
			else if(yMin > b)
				yMin = b;
		}
		bw.write((xMax - xMin) * (yMax - yMin) + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
