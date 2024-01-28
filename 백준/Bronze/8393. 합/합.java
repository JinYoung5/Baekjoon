import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();
        
        int sum = 0;
        
        for(int i=1; i<=a; i++) sum+=i;
        System.out.println(sum);
    }
}



/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int sum = 0;
        
        for(int i=1; i<=a; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
*/