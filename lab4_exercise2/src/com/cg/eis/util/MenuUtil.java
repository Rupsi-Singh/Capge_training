package com.cg.eis.util;

import java.util.List;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class MenuUtil {
	private EmployeeService employeeService;
	int id;
	String name;
	String designation;
	double salary;
	String insuranceScheme;
	public MenuUtil()
	{
		employeeService=new EmployeeServiceImpl();
	}
	
	public void start() {
		int choice;
		Scanner s=new Scanner(System.in);
		String continueChoice;
		do
		{
			showMenu();
			System.out.println("Enter your choice : ");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("------Get employee details------");
				
				employeeService.getEmployeeDetails( id,  name, designation, salary);
				System.out.println("Thank you for the details!!");
				break;
			case 2: 
				System.out.println("Based on your salary and designation you are eligible for the below scheme :");
				
				insuranceScheme= employeeService.getScheme(salary,designation);
				
				System.out.println(insuranceScheme);
				break;
			case 3:
				System.out.println("------Details--------");
				List<Employee> employees=employeeService.showAllDetails();
				for(Employee employee : employees) {
					System.out.println("Employee id : "+employee.getId());
					System.out.println("Employee name : "+employee.getName());
					System.out.println("Employee salary : "+employee.getSalary());
					System.out.println("Employee Designation :"+employee.getDesignation());
					System.out.println("Insurance scheme : "+employee.getIns());
				}
				
				break;
			case 0:
				System.exit(0);
				break;
			default:
				break;
				
			}
			System.out.println("Do you want to continue (yes/no) : ");
			continueChoice=s.next();
			
		}while(continueChoice.equalsIgnoreCase("yes"));
		}

	private void showMenu() {
		System.out.println("------------Employee Insurance System------------");
		System.out.println("1.Get employee details");
		System.out.println("2.Know your insurance scheme");
		System.out.println("3.Show all details");
		System.out.println("0. Exit");
}

}







