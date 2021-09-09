package com.jdbc1.employee;

import java.sql.SQLException;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		EmployeeUploader emp = new EmployeeUploader();
		
//		try {
//			emp.storeDepartmentDetails(2, "Development", "Hari","dev_dept");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		try {
			emp.storeEmployeeDetails(37, "jeyasree","Address_6",20000, 958523, 1);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
//		try {
//			System.out.println("Enter an employee id whose you want to know about :");
//			Scanner sc = new Scanner(System.in);
//			int empId = sc.nextInt();
//			emp.retreiveEmployeeDetails(empId);
//		}
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
	}

}
