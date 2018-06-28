import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {

	
  public static void echo(String s) {
        System.out.println(s);
     }

  public static void main(String[] args)  throws IOException {
        
        Scanner sc = new Scanner(System.in);

        

        int codigo = sc.nextInt();

        int numero = sc.nextInt();

        double cachorroquente = 4;
        double xsalada = 4.50;
        double xbacon = 5.00;
        double torrada = 2.00;
        double refrigerante = 1.50;
        double total = 0;

        switch (codigo) {
            case 1: total = cachorroquente * numero;
            break;
            case 2: total = xsalada * numero;
            break;
            case 3: total = xbacon * numero;
            break;
            case 4: total = torrada * numero;
            break;
            case 5: total = refrigerante * numero;
            break;
        } 


        System.out.printf("Total: R$ %.2f\n",total);
       
        
         

        

        
        
    } 

}