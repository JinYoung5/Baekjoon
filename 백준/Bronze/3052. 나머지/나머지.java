import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] arr = new boolean[42];
        
        for(int i=0; i<10; i++){
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }
        br.close();
        
        int count = 0;
        for (boolean b : arr){
            if(b){
                count++;
            }
        }
        
        System.out.println(count);
        
    }
}