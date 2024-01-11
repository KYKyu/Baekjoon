import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] tbl = new int[N][3];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            tbl[i][0] = Integer.parseInt(st.nextToken());
            tbl[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(tbl[i][0] < tbl[j][0] && tbl[i][1] < tbl[j][1]){
                    tbl[i][2]++;
                }
            }
        }

        for(int i = 0; i < N; i++){
            sb.append(tbl[i][2] + 1).append(" ");
        }
        System.out.println(sb);
        br.close();
        return;
    }
}
