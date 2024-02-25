import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String S;
        while(a-->0){
            S = br.readLine();
            System.out.println(S.charAt(0)+""+S.charAt(S.length()-1));
        }
    }
}