/*
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        sc.close();
        
        StringTokenizer st = new StringTokenizer(S, " "); //공백기준 토큰들을 st에 저장
        
        System.out.println(st.countTokens()); //countTokens(): 토큰 개수 반환
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        System.out.print(st.countTokens());
    }
}
*/
import java.io.IOException;
public class Main{
    public static void main(String[] args)throws IOException{
        int count = 0;
        int pre_str = 32;    //공백
        int str ;
        
        while(true){
            str = System.in.read();
            
            if(str == 32){                    //입력받은 문자가 공백일때
                if(pre_str != 32) count++;    //이전문자가 공백이 아닐경우
            }else if(str == 10){              //입력받은값이 행일 경우('\n')
                if(pre_str != 32) count++;    //이전의 문자가 공백이 아닐경우 빠져나옴
                break;
            }
            pre_str = str;
        }
        System.out.println(count);
    }
}