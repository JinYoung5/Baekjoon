import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        for(int i=0; i<N/4; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}

/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        for(int i=0; i<N/4; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
*/
