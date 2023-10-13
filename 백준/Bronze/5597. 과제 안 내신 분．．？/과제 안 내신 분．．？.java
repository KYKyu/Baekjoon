import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] student = new int[30];
		for(int i = 0; i < 30; i++) {
			student[i] = i+1;
		}

		int a;
		
		for(int i = 0; i < 28; i++){
            a = Integer.parseInt(br.readLine()) - 1;
            student[a] = 0;
        }
        
		for(int i = 0; i < 30; i++) {
			if(student[i] > 0)
				bw.write(student[i] + "\n");
		}
        
		bw.flush();
		bw.close();
		br.close();
	}

}