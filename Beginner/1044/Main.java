import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {

	
  public static void echo(String s) {
        System.out.println(s);
     }

  public static void main(String[] args)  throws IOException {
        
        Scanner sc = new Scanner(System.in);

        

       int[] X = new int[3];
      

       X[0] = sc.nextInt();
       X[1] = sc.nextInt();
       
       if (X[1] % X[0] == 0.0 || X[0] % X[1] == 0) {
          echo("Sao Multiplos");
       } else {
        
        echo("Nao sao Multiplos");
       }
       



      
        }
        

}       
        
         

        

        
        
     

