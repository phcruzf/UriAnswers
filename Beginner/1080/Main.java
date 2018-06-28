import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {


	public static void echo(String s) {
		System.out.println(s);
	}

	public static void main(String[] args)  throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[100];
		int maior = 0;
    
		for (int i = 0; i < numbers.length; i++){
			numbers[i] = sc.nextInt();
		}

    maior = numbers[0];

		for (int i = 0; i < numbers.length; i++){
			
			if (maior<numbers[i]){
        maior = numbers[i];
			} 
		}

		System.out.println(maior);

		for (int i = 0; i < numbers.length; i++){
			if(maior == numbers[i]){
				System.out.println(i+1);
			}
		}

		
		
    







		}

	 

		
			

			
	



}       


