import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math;

public class Main {


  public static void echo(String s) {
    System.out.println(s);
  }

  public static void main(String[] args)  throws IOException {

    Scanner sc = new Scanner(System.in);
    int par = 0;
    int impar = 0;
    int positivo = 0;
    int negativo = 0;

    int[] lmao = new int[5];

    for (int i = 0; i < lmao.length; i++){
      lmao[i] = sc.nextInt();
    }

    for (int i = 0; i < lmao.length; i++){
      if(lmao[i]>0){
        positivo++;
      } else if(lmao[i]<0){
        negativo++;
      }
    }
    
    for (int i = 0; i < lmao.length; i++){
      if(lmao[i]%2==0){
        par++;
      } else if(lmao[i]%2!=0){
        impar++;
      }
    }

    echo(par + " valor(es) par(es)");
    echo(impar +" valor(es) impar(es)");
    echo(positivo +" valor(es) positivo(s)");
    echo(negativo +" valor(es) negativo(s)");
    System.out
  }



}       


