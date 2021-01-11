/**
 * Write a Java program that displays the number of characters, lines and words in a text
 * @author Rupsi
 */
package com.capg.lab_3.util;
import java.util.*;
public class DisplayEverything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//String s=sc.next();
		String s="Hello World \nHow are you?";
		System.out.println(s);
		String []w=s.split("[ ,.]+");
	    String []l=s.split("[\r|\n]");
	    System.out.println("No of characters = "+s.length());
	    System.out.println("No of lines = "+l.length);
	    System.out.println("No of words = "+w.length);

	}

}
