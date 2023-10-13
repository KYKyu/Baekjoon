import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        int idx=0;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a < b){
            System.out.print(0);
            System.exit(0);
        }
        int[] array = new int[a];
        
        for (int i = 1; true; i++){
            if(a % i == 0){
                array[idx] = i;
                idx++;
            }
            if(i == a){
                break;
            }
        }
        System.out.print(array[b-1]);
        sc.close();
    }
}