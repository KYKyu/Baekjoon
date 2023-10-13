import java.util.Scanner;
public class  Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'c'){
            	try {
	                if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-'){
	                    count++;
	                    i++;
	                }
	                else
	                    count++;
            	}
            	catch(Exception e) {
            		count++;
            	}
            }
            else if(str.charAt(i) == 'd'){
            	try {
	                if(str.charAt(i+1) == 'z'){
	                	try {
	                		if(str.charAt(i+2) == '='){
	                            count++;
	                            i += 2;
	                        }
	                        else{
	                            count += 2;
	                            i++;
	                        }
	                	}
	                	catch(Exception e){
	                		count+=2;
	                		i++;
	                	}
	                }
	                else if(str.charAt(i+1) == '-'){
	                    count++;
	                    i++;
	                }
	                else
	                    count++;
	            	}
            	catch(Exception e) {
            		count++;
            	}
            }
            else if(str.charAt(i) == 'l'){
            	try {
	                if(str.charAt(i+1) == 'j'){
	                    count++;
	                    i++;
	                }
	                else
	                    count++;
	            }
            	catch(Exception e) {
            		count++;
            	}
            }
            else if(str.charAt(i) == 'n'){
            	try {
	                if(str.charAt(i+1) == 'j'){
	                    count++;
	                    i++;
	                }
	                else
	                    count++;
	            	}
            	catch(Exception e) {
            		count++;
            	}
            }
            else if(str.charAt(i) == 's'){
            	try {
	                if(str.charAt(i+1) == '='){
	                    count++;
	                    i++;
	                }
	                else
	                    count++;
            	}
            	catch(Exception e) {
            		count++;
            	}
            }
            else if(str.charAt(i) == 'z'){
            	try {
	                if(str.charAt(i+1) == '='){
	                    count++;
	                    i++;
	                }
	                else
	                    count++;
            	}
            	catch(Exception e) {
            		count++;
            	}
            }
            else
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}