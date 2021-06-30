import java.util.Scanner;
public class primeNum{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean b = false;
    for(int i=2; i<n/2; i++)
    {
      if(n%i == 0){
        b=true;
        break;
      }
    }
    if(!b){
      System.out.println(n + " is a prime number.");
    }
    else{
      System.out.println(n + " is not a prime number.");
    }
  }
}

 
