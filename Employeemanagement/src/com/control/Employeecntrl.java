package com.control;

import com.dao.DaoEmp;
import com.entity.Employee;

public class Employeecntrl {
	
	public static void main(String[] args) {
		
		DaoEmp d = new DaoEmp();
		
		System.out.println(d.showEmployeeById(1));	
	//	 System.err.println("***************************************************************");
		 
		for(Employee ee : d.showallEmployee()) {
			
	    System.out.println(ee);
	   
		}   
		 System.err.println("****************************************************************");
		 
		d.showEmployeeByRole("Tester");
		
		 System.err.println("***************************************************************");
		d.showEmployeeMaxSal();
		d.showEmployeeMinSal();
		 System.err.println("**************Asending order***********************************");
//		Employee[] data = d.showAseEmployee();
//		for(Employee e:data) {
//			System.out.println(e);
			d.showAseEmployee();
			 System.err.println("**************Desending order***********************************");
			d.showDesendEmployee();
		}
	}


