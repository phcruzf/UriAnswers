import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {

		public static void main(String[] args)  throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();

		
		int j = 0;

		for (int i=1;i<=Y;i++){
     
     

	   if(j==0){
	     System.out.print(i);
	     j++;
     } else if(j!=0){
     		System.out.print(" "+i);
     		j++;
     	}

     if(j==X){
     	System.out.print("\n");
     	j = 0;
      }

      

		}

		

	}
	

}       


