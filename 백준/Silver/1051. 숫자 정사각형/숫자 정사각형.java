import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();

		String line[] = new String[N];

		for (int i = 0; i < N; i++) {
			line[i] = sc.nextLine();
		}

		int ans = 0;
		int max = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int key = line[i].charAt(j) - '0';
				for (int k = j + 1; k < M; k++) {
					if (key == line[i].charAt(k) - '0') {
						for (int l = i + 1; l < N; l++) {
							if (key == line[l].charAt(j) - '0') {
								if (key == line[l].charAt(k) - '0') {
									if ((l + 1 - i) == (k + 1 - j)) {
										ans = (l + 1 - i) * (k + 1 - j);
										if (max < ans) {
											max = ans;

										}
									}
								}
							}
						}
					}
				}
			} 
		}
		System.out.println(max);
	}

	private static String src = "3 5\r\n" + "42101\r\n" + "22100\r\n" + "22101";
}