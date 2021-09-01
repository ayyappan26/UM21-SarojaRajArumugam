package com.umJavaTraining.project.beginners;

import java.util.*;

/**
 * @author HP
 *
 */
public class Employee {
	public EmployeeDTO[] getUserDetails(){
		Scanner sc = EmployeeUtility.getScannerInstance();
		System.out.println("Enter the no.of employees");
		int n = sc.nextInt();
		EmployeeDTO employees[] = new EmployeeDTO[n];
		EmployeeDTO emp=null;
		for(int i=0;i<n;i++) {
			emp = new EmployeeDTO();
			System.out.println("Enter empId:");
			emp.setEmpId(sc.nextInt());
			System.out.println("Enter employee's firstName:");
			emp.setFirstName(sc.next());
			System.out.println("Enter employee's lastName:");
			emp.setLastName(sc.next());
			System.out.println("Enter salary");
			emp.setSalary(sc.nextFloat());
			System.out.println("Enter Department");
			emp.setDept(sc.next());
			
			employees[i] = emp;
			
		}
		return employees;
	}
	
	public void printEmployees(EmployeeDTO myEmployee[]) {
		for(int i=0;i<myEmployee.length;i++) {
			System.out.println(myEmployee.length);
			EmployeeDTO employee = myEmployee[i];
			System.out.println("Employee id        = "+ employee.getEmpId() );
			System.out.println("Employee firstName = "+ employee.getFirstName() );
			System.out.println("Employee lastName  = "+ employee.getLastName() );
			System.out.println("Employee Salary    = "+ employee.getSalary() );
			System.out.println("Employee Department = "+ employee.getDept() );
			System.out.println("======================================================================");
			System.out.println("Hiii..");
			
		}
	}
}
