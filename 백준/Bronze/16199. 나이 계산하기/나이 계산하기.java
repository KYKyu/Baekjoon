import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int y1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		int d1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int y2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		int d2 = Integer.parseInt(st.nextToken());
		
		int age = y2 - y1;
		
		if(age >= 1) {
			if(m1 < m2) {
				sb.append(age).append("\n");
			}
			else if(m1 == m2) {
				if(d1 > d2) {
					sb.append(age - 1).append("\n");
				}
				else {
					sb.append(age).append("\n");
				}
			}
			else {
				sb.append(age - 1).append("\n");
			}
		}
		else {
			sb.append(age).append("\n");
		}
		
		sb.append(age + 1).append("\n").append(age);
		
		System.out.println(sb);
		br.close();
		return;
	}

}