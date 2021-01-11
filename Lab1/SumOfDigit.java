/**
*Author: Rupsi
*Desc: program to print the sum of digits of a given no.
*Date: 04/01/2021
*/
class SumOfDigit
{
 public static void main(String args[])
  {
    int no=134,rem,sum=0;
	while(no>0)
	{
	  rem= no%10;
	  sum=sum+rem;
	  no=no/10;
	}
   System.out.println("Sum of digits"+" ="+ sum);
   }
  }
	 
	