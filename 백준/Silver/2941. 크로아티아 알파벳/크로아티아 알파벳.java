import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int a = s.length();
        int count = 0;
        
        for(int i=0; i<a; i++){
            char ch = s.charAt(i);
            
            if(ch == 'c' && i<a-1){
                if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-'){
                    i++;
                }
            }else if(ch=='d' && i <a-1){
                if(s.charAt(i+1) == '-'){
                    i++;
                }else if(s.charAt(i+1) == 'z' && i<a-2){
                    if(s.charAt(i+2) == '='){
                        i+=2;
                    }
                }
            }else if((ch=='l' || ch=='n') && i<a-1){
                if(s.charAt(i+1) == 'j'){
                    i++;
                }
            }else if((ch=='s' || ch=='z') && i<a-1){
                if(s.charAt(i+1) == '='){
                    i++;
                }
            }
            count++;
        }
       System.out.println(count);
    }

}