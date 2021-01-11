/**
 * Create a class containing a method to create the mirror image of a String
 * @author Rupsi
 */


package com.capg.lab_3.util;
import java.util.*;

public class MirrorImage {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		System.out.println("----------Original String---------");
		System.out.println(str);
		System.out.println("--------Mirror Image of the String---------");
		String image=getImage(str);
		System.out.println(image);
		
	}
	static String getImage(String str)
	{
		String s=str;
		if(s.length()==0) {
			return "Empty String";}
		if(s.length()==1)
			return s;
		else { 
		StringBuffer obj=new StringBuffer(str);
		obj.reverse();
		String img1=str+"|"+obj;
		return img1;
			}		
}}
