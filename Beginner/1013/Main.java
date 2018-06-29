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
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int maiorAB = ((A + B + Math.abs(A-B))/2);
        
        maiorAB = (maiorAB + C + Math.abs(maiorAB - C))/2;

        echo (maiorAB + " eh o maior");
    }

}