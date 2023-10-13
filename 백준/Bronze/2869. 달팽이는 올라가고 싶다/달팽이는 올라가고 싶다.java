import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A, B, V;
        int days;
        A = sc.nextInt();
        B = sc.nextInt();
        V = sc.nextInt();
        
        days = (V - A) / (A - B) + 1;
        if((V - A) % (A - B) != 0)
            days++;
        if(V < A)
        	days = 1;
        
        System.out.print(days);
        sc.close();
    }
}