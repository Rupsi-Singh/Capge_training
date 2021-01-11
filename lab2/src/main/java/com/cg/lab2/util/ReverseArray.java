package com.cg.lab2.util;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 int size;
		 System.out.println("Enter the length of the array: ");
		 size=sc.nextInt();
		 int arr[]=new int[size];
		 System.out.println("Enter the elements of the array: ");
		 for(int i=0;i<size;i++)
		 {
			arr[i]=sc.nextInt(); 
		 }
		 System.out.println("-------Original Array---------");
		 for(int i=0;i<size;i++)
		 {
			System.out.println(arr[i]+" ");
		 }
		 System.out.println("------Changed Array-----");
		 int a[]=new int[size];
		 a=getSorted(arr);
		 for(int i=0;i<size;i++)
		 {
			 System.out.print(a[i]+" ");
		 }

	}
	public int arraySorting(int [] arr) {
		if(isEmpty(arr)) {
			return 0;
		}
		return 1;
	}
	

	private boolean isEmpty(int[] arr) {
		
		return arr.length==0;
	}
	
	public int[] duplicateArraySorting(int[] anArray) {
		 int ar[]= new int[1];
		 if(anArray[0]==anArray[1]) {
			 ar[0]=anArray[0];
	}    
		     return ar; 
	
	}

	static int[] getSorted(int arr[])
	{
		int temp[]=new int[arr.length];
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			temp[i]=arr[j];
			j--;
		}
		Arrays.sort(temp);
		
		return temp;
	}

}
