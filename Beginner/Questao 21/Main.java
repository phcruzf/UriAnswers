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

        double X = sc.nextDouble();
        
        double A = X / 100.0;
        double B = X % 100 / 50;
        double C = ((X % 100) % 50) / 20;
        double D = (((X % 100) % 50) % 20) / 10;
        double E = ((((X % 100) % 50) % 20) % 10) / 5;
        double F = (((((X % 100) % 50) % 20) % 10) % 5) / 2;
        double G = ((((((X % 100) % 50) % 20) % 10) % 5) % 2) / 1;
        double H = (((((((X % 100) % 50) % 20) % 10) % 5) % 2) % 1) / 0.50;
        double I = ((((((((X % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) / 0.25;
        double J = (((((((((X % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) / 0.10;
        double K = ((((((((((X % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) % 0.10) / 0.05;
        double L = (((((((((((X % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) % 0.10) % 0.05) / 0.01;
        
        
        
        echo("NOTAS:");

        echo(  (int) A + " nota(s) de R$ 100.00");
        echo(  (int) B + " nota(s) de R$ 50.00");
        echo(  (int) C + " nota(s) de R$ 20.00");
        echo(  (int) D + " nota(s) de R$ 10.00");
        echo(  (int) E + " nota(s) de R$ 5.00");
        System.out.print(  (int) F + " nota(s) de R$ 2.00\n\n");


        echo("MOEDAS:");

        
        echo( (int) G + " moeda(s) de R$ 1.00");
        echo( (int) H + " moeda(s) de R$ 0.50");
        echo( (int) I + " moeda(s) de R$ 0.25");
        echo( (int) J + " moeda(s) de R$ 0.10");
        echo( (int) K + " moeda(s) de R$ 0.05");
        echo( (int) L + " moeda(s) de R$ 0.01");
        
    } 

}