import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);
        if(s.equals(sb.reverse().toString())){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}