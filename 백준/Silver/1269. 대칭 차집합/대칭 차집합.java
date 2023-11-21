import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int aN = Integer.parseInt(st.nextToken()), bN = Integer.parseInt(st.nextToken());
		int[] a = new int[aN], b = new int[bN];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < aN; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < bN; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a); Arrays.sort(b);
		int index_a = 0, index_b = 0, count = 0;
		while(index_a != aN && index_b != bN) {
			if(a[index_a] == b[index_b]) {
				count++;
				index_a++; index_b++;
			}
			else if(a[index_a] < b[index_b]) {
				index_a++;
			}
			else {
				index_b++;
			}
		}
		System.out.println(aN + bN - 2*count);
		br.close();
		

	}

}
