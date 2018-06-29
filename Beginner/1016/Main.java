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

        int X = sc.nextInt();

        double carroX = 16.666666666; // m/s
        double carroY = 25; // m/s
        double Sa=0;
        double Sb=0;
        double tempo=0;

        X = X * 1000;

        while ( Sa > Sb -X ){

        tempo += 1;
        Sb = carroY*tempo;
        
        Sa = carroX*tempo;
        
        }

        tempo = tempo / 60;



                  

        echo (df.format(tempo) + " minutos");
        
    }

}