import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static char[][] danji;
    static boolean[][] check;
    static int count = 0; // 단지 수
    static int[] cntHome; // 단지 내의 집 수
    static ArrayList<Integer> list = new ArrayList<>();
    static int max; // 지도의 크기
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        max = N;
        danji = new char[N][N];
        check = new boolean[N][N];
        cntHome = new int[N * N];
        
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                danji[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (danji[i][j] == '1' && !check[i][j]) {
                    dfs(i, j);
                    count++;
                }
            }
        }

        Arrays.sort(cntHome);
        sb.append(count);
        for (int i = N * N - count; i < N * N; i++) {
            sb.append("\n").append(cntHome[i]);
        }

        System.out.println(sb);
        br.close();
    }

    static void dfs(int y, int x) { // 시작부분의 x, y좌표
        check[y][x] = true;
        cntHome[count]++;

        if (x < max - 1 && danji[y][x + 1] == '1' && !check[y][x+1]) {
            dfs(y, x + 1);
        }
        if (x > 0 && danji[y][x - 1] == '1' && !check[y][x-1]) {
            dfs(y, x - 1);
        }
        if (y < max - 1 && danji[y + 1][x] == '1' && !check[y+1][x]) {
            dfs(y + 1, x);
        }
        if (y > 0 && danji[y - 1][x] == '1' && !check[y-1][x]) {
            dfs(y - 1, x);
        }

    }
}
