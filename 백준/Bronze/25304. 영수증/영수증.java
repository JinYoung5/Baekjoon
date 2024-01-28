import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int total = 0;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            total += Integer.parseInt(st.nextToken())* Integer.parseInt(st.nextToken());
        }
        if(X==total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}


/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int total = 0;
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            total += a*b;
        }
        if(X==total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
*/