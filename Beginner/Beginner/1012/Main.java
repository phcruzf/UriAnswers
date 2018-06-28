import java.io.IOException;
import java.util.Scanner; 
import java.text.DecimalFormat;
import java.lang.Math;

public class Main {

        
        static double pi = 3.14159;
        static double b = 3;
        static double elevado;
       
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
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Calcula a area do triangulo
        
        echo ("TRIANGULO: " + df.format((A * C)/2));

        // Calcula a area de um circulo
         
        echo ("CIRCULO: " + df.format(pi * java.lang.Math.pow(C,2)));

        // Calcula a area de um trapezio

        echo ("TRAPEZIO: " + df.format(((A + B)/2) * C));

        //Calculo da area de um quadrado

        echo ("QUADRADO: " + df.format(B*B));

        //Calculo da area de um retangulo

        echo ("RETANGULO: " + df.format(A*B));
        
    }

}