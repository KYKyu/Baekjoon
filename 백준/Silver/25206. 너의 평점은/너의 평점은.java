import java.util.Scanner;
public class Main {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str, grade;
        double credit, grade_sum = 0, credit_sum = 0;
        
        for(int i = 0; i < 20; i++) {
        	str = sc.next();
            credit = sc.nextDouble();
            grade = sc.next();
            
            credit_sum += credit;
            
            if(grade.equals("A+"))
            	grade_sum += 4.5 * credit;
            else if(grade.equals("A0"))
            	grade_sum += 4.0 * credit;
            else if(grade.equals("B+"))
            	grade_sum += 3.5 * credit;
            else if(grade.equals("B0"))
            	grade_sum += 3.0 * credit;
            else if(grade.equals("C+"))
            	grade_sum += 2.5 * credit;
            else if(grade.equals("C0"))
            	grade_sum += 2.0 * credit;
            else if(grade.equals("D+"))
            	grade_sum += 1.5 * credit;
            else if(grade.equals("D0"))
            	grade_sum += 1.0 * credit;
            else if(grade.equals("P"))
            	credit_sum -= credit;
            else
            	;
        }
        
        System.out.println(grade_sum / credit_sum);
        
        sc.close();
    }

}