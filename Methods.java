import java.util.Scanner;

public class Methods{
  
  public static void convertFunc(double x){
    double min_in_year = (365*24*60);
    long years = (long)(x/min_in_year);
    int days = (int)((x/24/60)%365);
    System.out.println((int) x + " minutes is approximately " + years + " years and " + days + " days");
  }
  
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the number of minutes:");
    double a=sc.nextDouble();
    convertFunc(a);
  }
  
}

    
  
