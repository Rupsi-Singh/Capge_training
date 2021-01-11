package com.capg.lab_3.util;

import java.util.Scanner;
public class ReplaceConsonants {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.next();
    System.out.println("-----String before replacement----");
    System.out.println(str);
    String s=alterString(str);
    System.out.println("-----String after replacement-----");
    System.out.println(s);
	}
     static String alterString(String str)
    {
    	StringBuilder stt = new StringBuilder("");
    	char ele;
        char[] ch = str.toCharArray(); 
        int len=ch.length;
        for(int i=0;i<len;i++)
        {
        	if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u' && str.charAt(i)!='A' && str.charAt(i)!='E' && str.charAt(i)!='I' && str.charAt(i)!='O' && str.charAt(i)!='U')
        	{
        		ele=(char)(ch[i]+1);
        		
        	}
        	else 
        	{
        		ele=ch[i];
        		
        	}
        	stt=stt.append(ele);
        }
    	return stt.toString();
    }
}