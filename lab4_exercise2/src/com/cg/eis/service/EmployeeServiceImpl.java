package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.*;
public class EmployeeServiceImpl implements EmployeeService {

	
	List<Employee> detailsRepository;
	public EmployeeServiceImpl() {
		detailsRepository=new ArrayList<>();
	}
	
	
	@Override
	public void getEmployeeDetails(int id, String name, String designation, double salary) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your id:");
		id=sc.nextInt();
		System.out.println("Enter your name: ");
		name=sc.next();
		System.out.println("Enter your designation: ");
		designation =sc.next();
		System.out.println("Enter your salary: ");
		salary=sc.nextDouble();
		String ins=getScheme(salary,designation);
		
		Employee emp=new Employee(id,name,designation,salary,ins);
		
		detailsRepository.add(emp);
		
	}

	@Override
	public String getScheme(double salary, String designation) {
		String insurance="abcx";
		
		if(salary<10000 && designation.equalsIgnoreCase("associate"))
		{
			insurance="Auto insurance";
		}
	    if(salary>=10000 && designation.equalsIgnoreCase("manager"))
		{
			insurance= "Property and auto insurance";
		}
		return insurance;
		
	}

	@Override
	public void displayDetails(int id, String name, String designation, String insuranceScheme, double salary) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Employee> showAllDetails() {		
		
		return detailsRepository;
	}

	
}
