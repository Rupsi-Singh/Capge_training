/**
*  The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case. 
*  Return the resulting array.
*  Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE
*  @author Rupsi
*/
package com.cg.lab2.util;
import java.util.*;
public class SortedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		String [] arr = new String[size];
		System.out.println("Enter the Strings");
		for(int i=0;i<size;i++) {
			arr[i]=sc.next();}
			
		  System.out.print("Sorted Array: "+ sortStrings(arr));
	}

static String sortStrings(String[] arr) {
	StringBuilder sb =new StringBuilder();
	Arrays.sort(arr);
	int size = arr.length;
	if(size==0)
	  {
		return "Empty String";
	   }
	
	else
	{
		if(size==1)
		{
			return arr[0];
		}
		
		else if(size%2!=0)
		{
			for(int i=0;i<size;i++)
		    {
			   if(i<(size/2)+1) 
			{
				arr[i]=arr[i].toUpperCase();
				sb.append(arr[i]+" ");
			}
			else
			{
				arr[i]=arr[i].toLowerCase();
				sb.append(arr[i]+" ");
			}
		}}
			else {
     for(int i=0;i<size;i++) {
			if(i<(size/2)) 
			{
				arr[i]=arr[i].toUpperCase();
				sb.append(arr[i]+" ");
			}
			else{
				arr[i]=arr[i].toLowerCase();
				sb.append(arr[i]+" ");
			}
		}	
		}
	return sb.toString();
}}}
