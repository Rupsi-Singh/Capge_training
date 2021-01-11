/**
*Author: Rupsi
*Desc: program to print the reverse of a given no.
*Date: 04/01/2021
*/

class Reverse
{
  public static void main(String args[])
  {
    int no=321,r,rev=0;
	while(no>0)
	{
	 r=no%10;
	 rev=rev*10+r;
	 no=no/10;
	}
  System.out.println("The reverse of the no is "+rev);
  }
  }
	 
	