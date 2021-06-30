import java.util.Scanner;

public class SwitchCase{
  
  public static void main(String [] args){
    
    int choice;
    System.out.println("First one : 1. Hi\t2. Hey\t3. hello\t");
    Scanner sc=new Scanner(System.in);
    choice=sc.nextInt();
    
    switch(choice){
        
      case 1: System.out.println("YOu said Hi");
        break;
      case 2: System.out.println("YOu said Hey");
        break;
      case 3: System.out.println("YOu said Hello");
        break;
      default: System.out.println("Invalid choice");
        
    }
    
  }
  
}
