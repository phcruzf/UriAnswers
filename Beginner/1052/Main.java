import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {


  public static void echo(String s) {
    System.out.println(s);
  }

  public static void main(String[] args)  throws IOException {

    Scanner sc = new Scanner(System.in);
    
    int X = sc.nextInt();

    switch (X){
      case 1 : echo("January");
      break;
      case 2 : echo("February");
      break;
      case 3 : echo("March");
      break;
      case 4 : echo("April");
      break;
      case 5 : echo("May");
      break;
      case 6 : echo("June");
      break;
      case 7 : echo("July");
      break;
      case 8 : echo("August");
      break;
      case 9 : echo("September");
      break;
      case 10 : echo("October");
      break;
      case 11 : echo("November");
      break;
      case 12 : echo("December");
      break;
    }
  }



}       


