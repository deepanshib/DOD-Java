/* Calculate the power x^y. Optimize the code.*/
import java.util.Scanner;

/* Extended version of power function that can work
for float x and negative y*/

 class xistopowery{
	static float power(float x, int y)
{
   float temp;
   if( y == 0)
      return 1;
   temp = power(x, y/2);       
   if (y%2 == 0)
       return temp*temp;
   else
   {
       if(y > 0)
           return x*temp*temp;
       else
           return (temp*temp)/x;
   }
}  

/* Program to test function power */
public static void main(String args[])
{	
	float x;
	int y;
	Scanner s = new Scanner(System.in);
	System.out.print("enter 1st no");
	x=s.nextFloat();
	System.out.print("enter 2nd no");
   y= s.nextInt();
   System.out.print(power(x, y));
   
}
}
