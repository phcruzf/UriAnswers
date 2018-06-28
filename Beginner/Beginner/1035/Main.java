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

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        
        

        

        
        if (B > C && D > A && ((C + D) > (A + B)) && C > 0 && A > 0 && (A % 2 == 0)) {
        
        System.out.println("Valores aceitos");
                            
         }
         else {
            echo("Valores nao aceitos");
           }
         

        //echo("Valores nao aceitos");
        //echo("Valores aceitos");

        
        
    } 

}