import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {


	public static void echo(String s) {
		System.out.println(s);
	}

	public static void main(String[] args)  throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int ntests = sc.nextInt();
		int[] cases = new int[ntests];
		
		for (int i=0; i < ntests;i++){
		 cases[i] = sc.nextInt();
		}

		for(int i=0; i < ntests; i++){
		 if (cases[i]==0){
			echo("NULL");
		 }

		 if (cases[i]%2==0 && cases[i]!=0){
			if(cases[i]>0){
				echo("EVEN POSITIVE");
			} else if (cases[i]<0){
				echo("EVEN NEGATIVE");
			}
		 }

		 if (cases[i]%2!=0 && cases[i]!=0){
			if(cases[i]>0){
				echo("ODD POSITIVE");
			} else if (cases[i]<0){
				echo("ODD NEGATIVE");
			}

		 }

		}

	 

		
			

			
	}



}       


