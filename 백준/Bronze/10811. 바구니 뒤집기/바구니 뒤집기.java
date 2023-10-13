import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b, t, s, e;
        int temp;
        
        b = sc.nextInt();
        t = sc.nextInt();
        
        int[] num = new int[b];
        for(int i = 0; i < b; i++)
            num[i] = i+1;
        for(int i = 0; i < t; i++){
            s = sc.nextInt();
            e = sc.nextInt();
            s--;e--;
            for(; s < e ;){
                temp = num[s];
                num[s] = num[e];
                num[e] = temp;
                s++;e--;
            }
        }
        for(int i = 0; i < b; i++){
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}