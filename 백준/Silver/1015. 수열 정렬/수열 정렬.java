import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		int min_num = array[0];
		int min_index = 0;
		int[] index_array = new int[n];
		int[] flag = new int[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(flag[j] == 1)
					continue;
				if(min_num > array[j]) {
					min_num = array[j];
					min_index = j;
				}
			}
			index_array[min_index] = i;
			flag[min_index] = 1;
			for(int j = 0; j < n; j++) {
				if(flag[j] == 0) {
					min_num = array[j];
					min_index = j;
					break;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(index_array[i] + " ");
		}
		sc.close();
	}
}