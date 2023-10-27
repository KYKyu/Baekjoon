import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			int[] a = new int[3];
			int index = 0, max = 0, sum = 0;
			for(int i = 0; i < 3; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			
			if(a[0] == 0 && a[1] == 0 && a[2] == 0)
				break;

			for(int i = 0; i < 3; i++) {
				if(max < a[i]) {
					max = a[i];
					index = i;
				}	
			}
			for(int i = 0; i < 3; i++) {
				if(i == index)
					continue;
				sum += a[i];
			}
			if (sum <= max) {
				bw.write("Invalid\n");
				bw.flush();
				continue;
			}
			
			if(a[0] == a[1] && a[1] == a[2] && a[2] == a[0])
				bw.write("Equilateral\n");
			else if(a[0] != a[1] && a[1] != a[2] && a[2] != a[0]) 
				bw.write("Scalene\n");
			else {
				bw.write("Isosceles\n");
			}
			
			bw.flush();
		}

		bw.flush();
		bw.close();
		br.close();
	}

}