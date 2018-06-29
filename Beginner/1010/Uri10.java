import java.io.IOException;
import java.util.Scanner; 
import java.text.DecimalFormat;

public class Uri10 {
 
 public static void echo(String s) {
        System.out.println(s);
     }

  public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double[] numbers = new double[6];
        double valortotal = 0;

         for (int i = 0; i < numbers.length; i++)
    {
        numbers[i] = sc.nextDouble();
    }

        valortotal += ((numbers[1] * numbers[2]) + (numbers[4] * numbers[5]));
        

        echo ("VALOR A PAGAR: R$ " + df.format(valortotal));
        
    }

}