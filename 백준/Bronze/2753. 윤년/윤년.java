import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        
        System.out.print((A%4==0)?((A%400==0)? "1": (A%100==0)?"0":"1"):"0" );
    }
}

/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();
        
        if(A%4==0){
            if(A%400==0)System.out.println("1");
            else if(A%100==0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");
    }
}
*/