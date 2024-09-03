package com.dao;

import com.entity.Employee;

public class DaoEmp {

	Employee e1 = new Employee(1, "Ramesh sarkar", "Developer", 25000);
	Employee e2 = new Employee(6, "Ram sharma", "Tester", 32000);
	Employee e3 = new Employee(8, "Raj kapoor", "Analyst", 28000);
	Employee e4 = new Employee(5, "Viru shahu", "Admin", 26050);
	Employee e5 = new Employee(3, "Piryanhu prasand", "Developer", 25800);
	Employee e6 = new Employee(7, "Kimesh Rathore", "Tester", 25400);
	
	Employee e7 = new Employee(2, "Laleet Mahesh", "Admin", 35000);
	Employee e8 = new Employee(4, "Kiran Deo", "Analyst", 45000);
	Employee e9 = new Employee(9, "Shital kori", "Tester", 39000);
	Employee e10 = new Employee(10, "kamesh raut", "Admin", 45442);

	Employee[] emp = new Employee[10];
	Employee[] e;
	int size = emp.length;

	public Employee showEmployeeById(int id) {

		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		emp[4] = e5;
		emp[5] = e6;
		emp[6] = e7;
		emp[7] = e8;
		emp[8] = e9;
		emp[9] = e10;

		int index = id - 1;
		return emp[index];

	}

	public Employee[] showallEmployee() {
		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		emp[4] = e5;
		emp[5] = e6;
		emp[6] = e7;
		emp[7] = e8;
		emp[8] = e9;
		emp[9] = e10;

		return emp;
	}

	public void showEmployeeByRole(String role) {
		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		emp[4] = e5;
		emp[5] = e6;
		emp[6] = e7;
		emp[7] = e8;
		emp[8] = e9;
		emp[9] = e10;

		for (Employee employee : emp) {
			if (employee.getRole().equalsIgnoreCase(role))
				System.out.println(employee);
		}
	}

	public void showEmployeeMaxSal() {

		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		emp[4] = e5;
		emp[5] = e6;
		emp[6] = e7;
		emp[7] = e8;
		emp[8] = e9;
		emp[9] = e10;

		Employee max = emp[0];

		for (Employee e : emp) {
			if (e.getSal() > max.getSal()) {
				max = e;

			}

		}
		System.out.println("Maximum salary: " + max.getSal());
	}

	public void showEmployeeMinSal() {

		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		emp[4] = e5;
		emp[5] = e6;
		emp[6] = e7;
		emp[7] = e8;
		emp[8] = e9;
		emp[9] = e10;

		Employee min = emp[0];

		for (Employee e : emp) {
			if (e.getSal() < min.getSal()) {
				min = e;

			}
		}
		System.out.println("Minimum Salary: " + min.getSal());
	}

	public Employee[] showAseEmployee() {
		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		emp[4] = e5;
		emp[5] = e6;
		emp[6] = e7;
		emp[7] = e8;
		emp[8] = e9;
		emp[9] = e10;

//		Asending order

		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].getEmpid() > emp[j].getEmpid()) {
					Employee temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}

		}
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		return emp;

	}

	// Desending order
	public Employee[] showDesendEmployee() {
		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].getEmpid() < emp[j].getEmpid()) {
					Employee temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}

		}
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		return emp;
	}

}
