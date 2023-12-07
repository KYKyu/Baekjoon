import java.io.*;
import java.util.StringTokenizer;
import java.util.Comparator;
import java.util.Arrays;

class info{
	int age;
	String name;
}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		info[] arr = new info[N];
		for(int i = 0; i < N; i++) {
			arr[i] = new info();
		}
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i].age = Integer.parseInt(st.nextToken());
			arr[i].name = st.nextToken();
		}
		
		Arrays.sort(arr, new Comparator<info>() {
			public int compare(info a, info b) {
				if(a.age != b.age) {
					return a.age - b.age;
				}
				else {
					//return a.name.compareTo(b.name); // 나이 오름차순으로 정렬
					return 0;
				}
			}
		});
		
		for(int i = 0; i < N; i++) {
			sb.append(arr[i].age + " " + arr[i].name + "\n");
		}
		System.out.println(sb);
		br.close();
		return;

	}

}