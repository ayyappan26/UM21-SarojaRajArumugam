package com.umTraining.project;

import java.util.ArrayList;
import java.util.Scanner;



public class EmployeeBo {
	
	public ArrayList addEmployee(EmployeeDto empDto) {
		Scanner sc = EmployeeUtilty.getScannerInstance();
		System.out.println("Enter the no.of employees");
		int n = sc.nextInt();
		
//		EmployeeDt employees[] = new EmployeeDTO[n];
		ArrayList<EmployeeDto> employees = new ArrayList<EmployeeDto>();
		EmployeeDto emp=null;
		for(int i=0;i<n;i++) {
			emp = new EmployeeDto();
			System.out.println("Enter empId:");
			emp.setEmpId(sc.nextInt());
			System.out.println("Enter employee's First Name:");
			emp.setFirst_name(sc.next());
			System.out.println("Enter employee's lastName:");
			emp.setLast_name(sc.next());
			System.out.println("Enter salary");
			emp.setSalary(sc.nextFloat());
			
			
			employees.add(emp);
			
		}
		return employees;
	}
	
//	public EmployeeDto[] viewEmployee(int empId) {
//	
//		return(employees);
//	}
	
	public void editEmployee(int empId) {
		
	}
	
	public void printEmployees(ArrayList myEmployee) {
		for(int i=0;i<myEmployee.size();i++) {
		
			EmployeeDto employee = (EmployeeDto) myEmployee.get(i);
			System.out.println("Employee id        = "+ employee.getEmpId() );
			System.out.println("Employee firstName = "+ employee.getFirst_name() );
			System.out.println("Employee lastName  = "+ employee.getLast_name() );
			System.out.println("Employee Salary    = "+ employee.getSalary() );
			
			System.out.println("======================================================================");
			
		}
	}
}
