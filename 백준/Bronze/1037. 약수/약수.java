import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		
		array[0] = sc.nextInt();
		int maxNum = array[0], minNum = array[0];
		
		for(int i = 1; i < n; i++) {
			array[i] = sc.nextInt();
			if(maxNum < array[i])
				maxNum = array[i];
			if(minNum > array[i])
				minNum = array[i];
		}
		
		System.out.println(maxNum * minNum);
		sc.close();
	}

}
