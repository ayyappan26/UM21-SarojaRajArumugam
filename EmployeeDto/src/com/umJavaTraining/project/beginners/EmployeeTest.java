package com.umJavaTraining.project.beginners;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		EmployeeDTO empDto[] =emp.getUserDetails();
		emp.printEmployees(empDto);
	}
}
