import java.io.IOException;
import java.util.Scanner; 
import java.text.DecimalFormat;
import java.lang.Math;

public class Main {

	
  public static void echo(String s) {
        System.out.println(s);
     }

  public static void main(String[] args)  throws IOException {
        
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0");

        int banknote = sc.nextInt();

         int A = banknote % 100;
         int B = A % 50;
         int C = B % 20;
         int D = C % 10;
         int E = D % 5;
         int F = E % 2;
         



                  
        System.out.println(banknote);
        System.out.println(df.format(banknote/100) + " nota(s) de R$ 100,00");
        System.out.println(df.format(A / 50) + " nota(s) de R$ 50,00");
        System.out.println(df.format(B / 20) + " nota(s) de R$ 20,00");
        System.out.println(df.format(C / 10) + " nota(s) de R$ 10,00");
        System.out.println(df.format(D / 5) + " nota(s) de R$ 5,00");
        System.out.println(df.format(E / 2) + " nota(s) de R$ 2,00");
        System.out.println(df.format(F /1) + " nota(s) de R$ 1,00");
    }

}