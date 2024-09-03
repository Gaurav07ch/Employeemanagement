package com.entity;

public class Employee {
	
	private int empid ;
	private String name;
	private String role;
	private int sal;
	
	
	public Employee() {
		super();
	}


	public Employee(int empid, String name, String role, int sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.role = role;
		this.sal = sal;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", role=" + role + ", sal=" + sal + "]";
	}

}
