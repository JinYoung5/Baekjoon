import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //입력 개수
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int M = -1;
        double sum = 0.0;
        
        for(int i = 0; i<N; i++){
            int value = Integer.parseInt(st.nextToken());
            
            if(value > M){
                M = value;
            }
            sum += value;
        }
        System.out.println(((sum/M) * 100.0)/N);
    }
}