/* Print Fibonacci Numbers till n, where n is a number input by the user. 
   Consider 0 as the 1st Fibonacci Number. The time complexity here is O(2^n).
   Optimize the code to lower the time complexity.
 */

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(fib(n));
	}
	public static int fib(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		int f;
		f=fib(n-1)+fib(n-2);
		return f;
	}
}
