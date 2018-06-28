import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {

	
  public static void echo(String s) {
        System.out.println(s);
     }

  public static void main(String[] args)  throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[100];
        int[] pares = new int[100];

        for (int i=0;i<100;i++){
            numeros[i] = i+1;
        }

        for (int i=0; i < 100; i++){
            if ( numeros[i] % 2 == 0 ){
              
              System.out.println(numeros[i]);
            }
            

            
        }
        
       
       



      
        }
        

}       
        
         

        

        
        
     

