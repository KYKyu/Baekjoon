import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		System.out.println(recur(N, 0));

	}
	
	static int recur(int N, int count) {
		// 1이 되면 count만 반환
		if (N < 2) {
			return count;
		}
		// 재귀를 통해 가장 연산수가 적은 경로를 찾아냄
		return Math.min(recur(N / 2, count + 1 + (N % 2)), recur(N / 3, count + 1 + (N % 3)));
 
	}
}
