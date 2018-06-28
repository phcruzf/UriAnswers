import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {

	
  public static void echo(String s) {
        System.out.println(s);
     }

  public static void main(String[] args)  throws IOException {
        
        Scanner sc = new Scanner(System.in);

        
        float x = sc.nextFloat();
        float pagamento = 0;
        

        if (x <= 2000.00){
            
        } else if (x > 2000.01 && x <= 3000.00){
          pagamento = (x - 2000.00f) * 0.08f;
        } else if (x > 3000.00 && x <= 4500.00){
            pagamento = (1000 * 0.08f) + ((x- 3000f)*0.18f);
        } else if (x > 4500){
            pagamento = ((1000.00f * 0.08f) + (1500.00f * 0.18f) + ((x - 4500.00f) *0.28f));
        }
       
       System.out.printf((pagamento == 0)?"Isento\n" : "R$ %.2f\n", pagamento);
       
       



      
        }
        

}       
        
         

        

        
        
     

