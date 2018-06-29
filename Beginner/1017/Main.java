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

        DecimalFormat df = new DecimalFormat("0.000");

        double tempo = sc.nextDouble();

        double velocidade = sc.nextDouble();

        double S = velocidade * tempo;

        double consumo = S / 12; 



                  

        System.out.println(df.format(consumo));
        
    }

}