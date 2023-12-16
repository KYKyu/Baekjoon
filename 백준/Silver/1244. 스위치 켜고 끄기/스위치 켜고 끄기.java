import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;	
		StringBuilder sb = new StringBuilder();
		int SN = Integer.parseInt(br.readLine());
		int[] arr = new int[SN];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < SN; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int student_num = Integer.parseInt(br.readLine());
		
		int s, num;
		while(student_num-- > 0) {
			st = new StringTokenizer(br.readLine());
			s = Integer.parseInt(st.nextToken());
			num = Integer.parseInt(st.nextToken());
			
			if(s == 1) {
				for(int i = 1; i * num <= SN; i++) {
					if(arr[i * num - 1] == 1) {
						arr[i * num - 1] = 0;
					}
					else {
						arr[i * num - 1] = 1;
					}
				}
			}
			else if(s == 2) {
				for(int i = 0; num - i - 1 >= 0 && num + i - 1 <= SN - 1; i++) {
					if(i == 0) {
						if(arr[num - 1] == 1) {
							arr[num - 1] = 0;
						}
						else {
							arr[num - 1] = 1;
						}
						continue;
					}
					if(arr[num - i - 1] == arr[num + i - 1]) {
						if(arr[num - i - 1] == 1) {
							arr[num - i - 1] = 0;
						}
						else {
							arr[num - i - 1] = 1;
						}
						
						if(arr[num + i - 1] == 1) {
							arr[num + i - 1] = 0;
						}
						else {
							arr[num + i - 1] = 1;
						}
					}
					else {
						break;
					}
				}
			}
			
		}
		for(int i = 1; i <= SN; i++) {
			sb.append(arr[i - 1] + " ");
			if(i % 20 == 0) {
				sb.append("\n");
			}
		}
		System.out.println(sb);
		br.close();
		return;

	}

}