import java.io.IOException;
import java.util.Scanner; 


public class Main {

		public static void main(String[] args)  throws IOException {

		Scanner sc = new Scanner(System.in);
		
		float S=0;

		for (float i =1;i<=100;i++){
         S += (1/i);
		}

		System.out.printf("%.2f\n",S);

	 }
	

}       


