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
      

       X[0] = sc.nextInt(); // hora de inicio
       X[1] = sc.nextInt(); // minuto de inicio
       X[3] = sc.nextInt(); // hora de fim
       X[4] = sc.nextInt(); // minuto ...

       int tempo = 0, tempo2 = 0;
       

       if(X[0] >= X[3]){
         tempo = 24 - X[0] + X[3];
       } else {
        tempo = X[3] - X[0];
       }

       if(X[1] >= X[4]){
         tempo2 = X[1] - X[4];
       } else {
        tempo2 = X[1] + X[4];
       }
       
       echo("O JOGO DUROU " + tempo + " HORA(S) E "+ tempo2 +" MINUTO(S)");
       



      
        }
        

}       
        
         

        

        
        
     

