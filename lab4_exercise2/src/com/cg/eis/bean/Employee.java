package com.cg.eis.bean;

public class Employee {
	
	private int id;
	private String name;
	private String designation;
	private double salary;
	private String ins;
	public Employee(int id,String name, String designation, double salary,String ins)
	{
		super();
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.ins=ins;

	}
	//public void setIns(String ins) {
		//this.ins = ins;
	//}
	public String getIns() {
		return ins;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
		

}
