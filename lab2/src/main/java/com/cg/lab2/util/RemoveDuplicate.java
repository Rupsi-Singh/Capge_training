/**
*  Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order
* @author-Rupsi
*/


package com.cg.lab2.util;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {

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
		 //int a[]=new int[size];
		 int a[]=removeDup(arr);
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
     

	}
	static int removingDuplicate(int[] arr) {
		return 0;
	}

	public int[] sortSingleArray(int[] input) {
		return input;
}

	static int[] removeDup(int arr[])
	{
		int n=arr.length;
			
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[n-1];
					n--;
					j--;
				}
			}
		}
	  int arr1[]=Arrays.copyOf(arr,n);
	  Arrays.sort(arr1);
	  int temp[]=new int[arr1.length];
		int j=arr1.length-1;
		for(int i=0;i<arr1.length;i++)
		{
			temp[i]=arr1[j];
			j--;
		}
	  return temp;
	}

	}
	

