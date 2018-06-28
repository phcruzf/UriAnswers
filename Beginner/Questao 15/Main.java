import java.io.IOException;
import java.util.Scanner; 
import java.text.DecimalFormat;
import java.lang.Math;

public class Main {

	
 public static void echo(double s) {
        System.out.println(s);
     }

  public static void main(String[] args)  throws IOException {
        
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.0000");

        
        double[] aviaoA = new double[2];
        double[] aviaoB = new double[2];
        
        for (int i = 0; i < aviaoA.length; i++) {

        aviaoA[i] = sc.nextDouble();

        }

        for (int i=0; i < aviaoA.length; i++) {

        aviaoB[i] = sc.nextDouble();
        
        }


        double distancia = Math.sqrt((Math.pow(aviaoB[0] - aviaoA[0],2)) + (Math.pow(aviaoB[1]-aviaoA[1],2)));

        System.out.println (df.format(distancia));
    }

}