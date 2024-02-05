import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[31];
        for (int i=1; i<=28; i++){
            int b = Integer.parseInt(br.readLine());
            arr[b] = 1;
        }
        for(int i=1; i<=30;i++){
            if(arr[i] != 1)
                System.out.println(i);
        }
    }
}