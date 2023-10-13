import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine());
        int s = 64, count = 1;
        int sum = 0;
        
        if(X == s) {
        	bw.write(count + "");
        	bw.flush();
        	bw.close();
        	br.close();
        	System.exit(0);
        }
        while(true) {
        	if(sum + s == X) {
        		break;
        	}
        	s = s/2;
        	count++;
        	if(sum + s >= X)
        		count--;
        	else {
        		sum += s;
        	}
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}