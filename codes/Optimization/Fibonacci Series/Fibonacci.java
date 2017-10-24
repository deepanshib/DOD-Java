/* Print Fibonacci Numbers till n, where n is a number input by the user. 
   Consider 0 as the 1st Fibonacci Number. The time complexity here is O(2^n).
   Optimize the code to lower the time complexity.
 */
// Fibonacci Series using Dynamic Programming

import java.util.Scanner;


class fib_optimisation
{
   static int fib(int n)
    {
       
    int f[] = new int[n+1];
    int i;
      
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0;
    f[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
     
        f[i] = f[i-1] + f[i-2];
    }
      
    return f[n];
    }
      
    public static void main (String args[])
    {
    	System.out.print("Enter a no.");
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.println(fib(n));
    }
}
