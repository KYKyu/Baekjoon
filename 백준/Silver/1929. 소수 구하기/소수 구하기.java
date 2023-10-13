import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, i = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        
        while(a <= b){
            double n = Math.sqrt(a);
            for (int j = 2; j <= n; j++){
                if(a % j == 0){
                    i++;
                    break;
                }
            }
            if(i == 0 && a >= 2)
                System.out.println(a);
            i = 0;
            a++;
        }
        sc.close();
    }
}