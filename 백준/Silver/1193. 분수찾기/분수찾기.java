import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 2, round = 1, i = 1;
        while(true){
        	if(n <= round){
        		if(i%2 == 0) {
        			System.out.print(i - (round - n) + "/" + (i+1 - (i - (round - n))));
            		break;
        		}
        		else {
        			System.out.print((i+1 - (i - (round - n))) + "/" + (i - (round - n)));
            		break;
        		}
        	}
        	round += count;
        	count++;
        	i++;
        }
        sc.close();
    }                                               
}