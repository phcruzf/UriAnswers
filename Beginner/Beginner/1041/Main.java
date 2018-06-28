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

        float y = sc.nextFloat();
        
        if(x == 0.0 && y == 0.0) {
            echo("Origem");
        } else if (x == 0.0 && y != 0.0){
            echo("Eixo X");
        } else if (x != 0.0 && y == 0.0) {
            echo("Eixo Y");
        } else if (x != 0.0 && y != 0.0){
            if (x > 0 && y > 0){
                echo("Q1");
            } else if (x < 0.0 && y > 0.0) {
                echo("Q2");
            } else if (x < 0.0 && y < 0.0){
                echo("Q3");
            } else if (x > 0.0 && y < 0.0){
                echo("Q4");
            } 
        }


        }
        

}       
        
         

        

        
        
     

