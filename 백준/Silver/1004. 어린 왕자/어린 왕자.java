import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x1, y1, x2, y2;
        int n, cx, cy, r;
        int count = 0;
        
        for(int i = 0; i < t; i++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            
            n = sc.nextInt();
            
            for(int j = 0; j < n; j++){
                cx = sc.nextInt();
                cy = sc.nextInt();
                r = sc.nextInt();
                double dis1 = Math.sqrt(Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2));
                double dis2 = Math.sqrt(Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2));
                
                if(dis1 < r && dis2 < r);
                else if(dis1 < r || dis2 < r)
                	count++;
                else;
            }         
            System.out.println(count);
            count = 0;
        }
        sc.close();
    }
}