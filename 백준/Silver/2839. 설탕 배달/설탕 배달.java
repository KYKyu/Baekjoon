import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N == 3){
            System.out.println(1);
            return;
        }
        else if(N == 4){
            System.out.println(-1);
            return;
        }

        int[] arr = new int[N + 1];
        arr[0] = -1; arr[1] = -1; arr[2] = -1; arr[3] = 1; arr[4] = -1; arr[5] = 1;

        for(int i = 6; i <= N; i++){
            int three = i - 3;
            int five = i - 5;
            if(arr[three] == -1 && arr[five] == -1){
                arr[i] = -1;
            }
            else if(arr[three] != -1 && arr[five] == -1){
                arr[i] = arr[three] + 1;
            }
            else if(arr[three] == -1 && arr[five] != -1){
                arr[i] = arr[five] + 1;
            }
            else{ //arr[three] != -1 && arr[five] != -1
                arr[i] = arr[three] > arr[five] ? arr[five] + 1 : arr[three] + 1;
            }
        }

        System.out.println(arr[N]);
        br.close();

    }
}
