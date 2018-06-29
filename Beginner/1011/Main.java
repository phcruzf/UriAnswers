import java.io.IOException;
import java.util.Scanner; 
import java.text.DecimalFormat;
import java.lang.Math;
public class Main {

        static double valortotal = 0;
        static double pi = 3.14159;
        static double b = 3;
        static double elevado;
        static double formula = 0;

 public static void echo(String s) {
        System.out.println(s);
     }

 public static double Power (double a){
    elevado = java.lang.Math.pow(a,3);
    return (elevado);
 } 
  public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        
        double R = sc.nextDouble();
        
        Power(R); 
        formula = ((4/3.0) * (pi)) * (elevado);
      
        echo ("VOLUME = " + df.format(formula));
        
    }

}