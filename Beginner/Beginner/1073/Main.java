import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {

	
  public static void echo(String s) {
        System.out.println(s);
     }

  public static void main(String[] args)  throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        
        for (int i = 1; i <= X; i++){
        if (i % 2 == 0){
         System.out.printf(i+"^2 = %.0f\n", Math.pow(i,2));
        }
      }
        }
           
      

}       
        
         
