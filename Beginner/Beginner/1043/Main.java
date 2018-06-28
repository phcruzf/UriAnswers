import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {

	
  public static void echo(String s) {
        System.out.println(s);
     }

  public static void main(String[] args)  throws IOException {
        
        Scanner sc = new Scanner(System.in);

        

       float[] X = new float[3];
      

       X[0] = sc.nextFloat();
       X[1] = sc.nextFloat();
       X[2] = sc.nextFloat();

       if (X[0] < X[1] + X[2] && X[1] < X[0] + X[2] && X[2] < X[1] + X[0]) {
        echo("Perimetro = " + (X[0] + X[1]+ X[2]));
       } else {
        echo("Area = "+(((X[0] + X[1])*X[2])/2));
       }
       



      
        }
        

}       
        
         

        

        
        
     

