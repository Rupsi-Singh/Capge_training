package com.capg.lab_3.util;
import java.util.*;
public class ModifiedNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		String str=Integer.toString(num);
	    System.out.print(modifyNumber(str));
		}
	 static String modifyNumber(String str)
		{
			StringBuilder st = new StringBuilder();
			char []ch=str.toCharArray();
			int size=str.length();
			int a,b,dif;
			
			for(int i=0;i<size-1;i++)
			{
				a=(int)(ch[i]);
				b=(int)(ch[i+1]);
				dif=Math.abs(a-b);
				st=st.append(dif);
			}
			st.append(ch[size-1]);
			return st.toString();


	}

}
