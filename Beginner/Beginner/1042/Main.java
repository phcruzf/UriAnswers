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
       X[2] = sc.nextInt();


       int[] Y = X.clone();
       
       int maior;
       
       
        // booble sort
        boolean troca = true;       
        while (troca){
        troca = false;       
        for (int i = 0; i < X.length-1; i++) {
        if (X[i]>X[i+1]){
           maior= X[i];
           X[i] = X[i+1];
           X[i+1] = maior;
           troca = true;
        }
       }
   }



       System.out.println((int)X[0]);
       System.out.println((int)X[1]);
       System.out.println((int)X[2]);

       System.out.println();

       System.out.println((int)Y[0]);
       System.out.println((int)Y[1]);
       System.out.println((int)Y[2]);

        }
        

}       
        
         

        

        
        
     

