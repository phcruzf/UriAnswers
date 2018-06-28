import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {

		public static void main(String[] args)  throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int[] fibonacci = new int[n];

		if (fibonacci.length==1){
			
			System.out.print(fibonacci[0]);
			
		}
		if (fibonacci.length>=2){
			fibonacci[1] = 1;
			System.out.print(fibonacci[0]);
			System.out.print(" "+fibonacci[1]);
		}
    if (fibonacci.length>=3){
		for (int i = 2 ; i < fibonacci.length; i++){
      fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			System.out.print(" " + fibonacci[i]);
		}
	}
	 System.out.print("\n");

		

	}
	

}       


