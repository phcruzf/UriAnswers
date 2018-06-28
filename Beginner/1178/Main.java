import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {

		public static void main(String[] args)  throws IOException {

		Scanner sc = new Scanner(System.in);
		
		Double t = sc.nextDouble();

		Double[] n = new Double[100];

		n[0] = t;

		System.out.printf("N[" + 0 + "] = %.4f\n",n[0]);

		for(int i = 1; i < n.length; i++){
      
     
      n[i] = n[i-1] /2;
      System.out.printf("N[" + i + "] = %.4f\n",n[i]);

		}

	}
	

}       


