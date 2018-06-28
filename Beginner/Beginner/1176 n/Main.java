import java.io.IOException;
import java.util.Scanner; 


public class Main {

		public static void main(String[] args)  throws IOException {

		Scanner sc = new Scanner(System.in);
		
		long[] fib = new long[61];
		int[] cases = new int[61];
		fib[1] = 1;
		fib[0] = 0;

		
		
    // Popula o array fib com os primeiros 60 numeros da sequencia de fibonacci
		for (int i=2;i<fib.length;i++){
     fib[i] = fib[i-1] + fib[i-2];
     }

     int t = sc.nextInt();
     
    //popula o array case com os t casos apartir de 0
    for(int i = 0; i < t && t > 0 && t <cases.length;i++) {
     cases[i] = sc.nextInt();

     }
    
    // imprime os elementos selecionados do array fib baseando-se no array cases
    for(int i = 0; i < t && t > 0 && t <cases.length;i++) {
    	System.out.println("Fib("+cases[i]+") = "+fib[cases[i]]);
    }
		

	}
	

}       


