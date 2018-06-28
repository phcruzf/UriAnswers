import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {

	
  public static void echo(String s) {
        System.out.println(s);
     }

  public static void main(String[] args)  throws IOException {
        
        Scanner sc = new Scanner(System.in);

        

       int[] X = new int[5];
       
       String S = sc.nextLine();     
       short b = 0b0000000000000000;



       switch (S) {
        case "vertebrado" : b = (byte) (b ^ 1); 
        case "invertebrado" : b = (byte) (b ^ (1 << 1));;
       }
       
       System.out.println(b);
       



      
        }
        

}       
        
         

        

        
        
     

