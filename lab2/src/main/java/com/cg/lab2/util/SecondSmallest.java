package com.cg.lab2.util;
import java.util.*;
public class SecondSmallest {
	
	public static void main(String args[])
	{
		int size;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<size;i++)
		{ 
			arr[i]=sc.nextInt();
		  	
		}
		int res=getSecondSmallest(arr);
		System.out.println("The second smallest element is: "+res);
				
	}

	static public int getSecondSmallest(int[] numbers) {
		int temp,size;
	    if(numbers.length==0)
		{
			return 0;
		}
	    size=numbers.length;
	    for(int i=0;i<size;i++)
	    {
	    	for(int j=i+1;j<size;j++)
	    	{
	    		if(numbers[i]>numbers[j])
	    		{
	    			temp=numbers[i];
	    			numbers[i]=numbers[j];
	    			numbers[j]=temp;
	    		}
	    	}
	    }
		return numbers[1];
	}

}
