package com.cg.eis.exception;

import java.util.*;
public class Validation {
	
	public static void main(String args[]) throws InvalidAgeException, InvalidNameException,InvalidSalaryException {
		Scanner sc= new Scanner(System.in);
		int age;
		System.out.println("Enter age: ");
		age=sc.nextInt();
		validateAge(age);
		
		String firstName,lastName;
		System.out.println("Enter firstname");
		firstName=sc.next();
		System.out.println("Enter lastname");
		lastName=sc.next();
		validateName(firstName,lastName);
		double salary;
		System.out.println("Enter salary: ");
		salary=sc.nextDouble();
		validateSalary(salary);
		
		
	}
	static void validateAge(int age) throws InvalidAgeException
	{
		if(age<15)
			{
				throw new InvalidAgeException("Invalid Age!! Please enter valid age.");
			}
			else
			{
				System.out.println("Valid Age!!");
			}
	}
	
   static void validateName(String firstName, String lastName) throws InvalidNameException
   {
	   if(firstName.isEmpty() || lastName.isEmpty())
	   {
		   throw new InvalidNameException("Inavlid Name!! Please enter valid name.");
	   }
	   else
	   {
		   System.out.println("Valid name");
	   }
   }
   
   static void validateSalary(double salary) throws InvalidSalaryException
   {
	   if(salary<3000)
	   {
		  throw new InvalidSalaryException("Invalid salary!! Please enter valid salary."); 
	   }
	   else {
		   System.out.println("Valid salary");
	   }
   }
	
	}


