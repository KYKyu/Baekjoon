import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h, m, s, round = 0;
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        m += s;
        round = m / 60;
        for (int i = 0; i<round;i++)
        {
            if (m >= 60){
                h++;
                m -= 60;
                if(h>23){
                    h=0;
                }
            }
        }
        System.out.println(h + " " + m);
        sc.close();
    }
}