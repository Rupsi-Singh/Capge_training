/**
 * Java program that reads a line of integers and then
 *  displays each integer and the sum of all integers.
 *  @author Rupsi
 */
package com.capg.lab_3.util;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		StringTokenizer token=new StringTokenizer("1 2 3 4");
		int digit,sum=0;
		System.out.println("------Line of integers--------");
		while(token.hasMoreTokens())
		{
			digit=Integer.parseInt(token.nextToken());
		 System.out.print(digit);
		 sum+=digit;
		}
		System.out.println();
     System.out.println("Sum of all the integers are "+sum);
	}

}
