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

        DecimalFormat df = new DecimalFormat("0,00000");

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double delta = (B*B) - (4*A*C);


        double Raiz1 = ( -B + Math.sqrt(delta)) / (2*A);
        double Raiz2 = ( -B - Math.sqrt(delta)) / (2*A);

        if ((A == 0) || (delta < 0)) {
           System.out.println("Impossivel calcular");
        } else {
           System.out.printf("R1 = %.5f\n", Raiz1);
           System.out.printf("R2 = %.5f\n", Raiz2);
        }
        
         

        //echo("Valores nao aceitos");
        //echo("Valores aceitos");

        
        
    } 

}