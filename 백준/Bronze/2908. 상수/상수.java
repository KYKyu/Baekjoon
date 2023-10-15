import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String nA, nB, bigN = "";
		nA = st.nextToken();
		nB = st.nextToken();

		for(int i = 2; i >= 0; i--) {
			if(nA.charAt(i) > nB.charAt(i)){
				bigN = nA;
				break;
			}  
			else if(nA.charAt(i) < nB.charAt(i)) {
				bigN = nB;
				break;
			}
		}
		
		for(int i = 2; i >= 0; i--) {
			bw.write(bigN.charAt(i));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
