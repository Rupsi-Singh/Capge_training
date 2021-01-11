/**
*Author: Rupsi
*Desc: program to print Fibonacci series
*Date: 04/01/2021
*/
class FibonacciNo
{
  public static void main(String args[])
    {
	  int a=0,b=1;
	  System.out.print(a+" "+b);
	  
	  for(int i=2;i<10;i++)
	    {
		  int c=a+b;
		  System.out.print(" "+c);
		  a=b;
		  b=c;
		}
	}
}
		  