import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = i + 1;
        }
        for(int i=0; i<M; i++){ //M개 줄
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken()) - 1; //배열 0부터
            int b = Integer.parseInt(st.nextToken()) - 1; //배열 0부터
            
            while(a<b){
                int c = arr[a];
                arr[a++] = arr[b];
                arr[b--] = c;
            }
        }
        br.close();
        for(int d:arr)
            System.out.print(d + " ");
    }
}