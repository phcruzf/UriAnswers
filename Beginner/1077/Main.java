import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {

		public static void main(String[] args)  throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		int[] n = new int[1000];

		

		

	int j = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = j++;
            if ( j == t) {
                j = 0;
            }
            System.out.println("N[" + i + "] = " + n[i]);
}



	}
	

}       


