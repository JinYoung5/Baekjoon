import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        br.close();
        
        for(int i = 1; i<10; i++){
            System.out.println(a+" * "+i+" = "+(a*i));
        }
    }
}

/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int a = sc.nextInt();
        
        sc.close();
        
        for(int i = 1; i<10; i++){
            System.out.println(a+" * "+i+" = "+(a*i));
        }
    }
}
*/