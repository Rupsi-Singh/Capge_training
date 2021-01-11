/**
 * Create a method that accepts a String and checks if it is a positive string
 * @author Rupsi
 */
package com.capg.lab_3.util;
import java.util.*;
public class PositiveString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		boolean ans=positiveString(s);
		System.out.println(ans);

	}
	static boolean positiveString(String s)
	{
		int flag=0;
		for(int i=0;i<s.length()-1;i++)
		{
			char ch=s.charAt(i);
			char ch1=s.charAt(i+1);
			int diff=ch1-ch;
            if(diff<0)
              flag=0;
            else
            	flag=1;    
         }
		if(flag==0)
			return false;
		else
			return true;	
	}

}
