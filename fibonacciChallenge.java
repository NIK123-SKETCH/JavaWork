//Fibonacci challenge without recursion 

import java.util.Scanner;
public class Fibonacci {
  
    public static void main(String [] args){
      
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x = 0;
        int y = 1;
        System.out.print(x + " ");
        System.out.print(y + " ");
        for(int i=0; i<n; i++)
        {
            int z=x+y;
            x=y;
            y=z;
            System.out.print(z + " ");
        }
    }
}

//Fibonacci challenge with recursion 

import java.util.Scanner;
public class Fibonacci {
  public static void main(String[] args){
        int n;
        System.out.println("Enter the number of fibonnaci numbers you want to print: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i<n; ++i)
        {
            System.out.print(fibonacciNum(i) + " ");
        }
    }
 public static int fibonacciNum(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibonacciNum(n-1) + fibonacciNum(n-2);
    }
}
