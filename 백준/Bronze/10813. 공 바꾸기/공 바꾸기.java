import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }
        for(int i=0; i<M; i++){
          int t;
            st=new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            t = arr[A-1];
            arr[A-1] = arr[B-1];
            arr[B-1] = t;
        }
        br.close();
        
        for(int b:arr)
            System.out.print(b + " ");
    }
}