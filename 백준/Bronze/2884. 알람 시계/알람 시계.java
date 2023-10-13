import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h, m;
        h = sc.nextInt();
        m = sc.nextInt();
        m -= 45;
        if(m < 0){
            h--;
            if(h < 0)
                h = 23;
            m += 60;
        }
        System.out.println(h + " " + m);
    }
}