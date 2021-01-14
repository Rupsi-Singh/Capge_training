package com.cg.eis.service;

import java.util.List;


import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	void getEmployeeDetails(int id,String name, String designation, double salary);
	 String getScheme(double salary,String designation);
	 void displayDetails(int id,String name, String designation, String insuranceScheme,double salary);
	 List<Employee> showAllDetails();
}
