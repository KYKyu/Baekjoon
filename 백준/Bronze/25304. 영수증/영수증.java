import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int a, b;
        int c = 0;
        
        for(int i = 0; i < n;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c += a * b;
        }
        if(c == sum)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}