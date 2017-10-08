/* Print prime Numbers from 1 to n, where n is a number input by the user. The time complexity here is O(2^n).
   Optimize the code to lower the time complexity.
 */

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s= new Scanner(System.in);
         System.out.println("Enter n");
         int n=s.nextInt();
         int i=2;
         int j=2;
         int flag=0;
         while(i<=n){
        	 j=2; flag=0;
        	 while(j<i){
        		 if(i%j==0)
        			 flag++;
        		 j++;
        	 }
        if(flag==0)
        	System.out.println(i+" ");
         i++;
         }
	}

}
