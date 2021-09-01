package com.umTraining.project;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServices {
	public static void main(String[] args) {
		EmployeeBo empBo = new EmployeeBo();
		ArrayList<EmployeeDto> empDTOArrayList = new ArrayList<EmployeeDto>();
		EmployeeDto empDto = new EmployeeDto();
		System.out.println("Enter your choice:\n1.Register Employee\n2.View Employee Details\n3.Edit Employee");
		Scanner scan = EmployeeUtilty.getScannerInstance();
		int choice = scan.nextInt();
		switch(choice) {
			case 1:
				empDTOArrayList=empBo.addEmployee(empDto);
				System.out.println("Employee Added successfully!");
				empBo.printEmployees(empDTOArrayList);
		}
		
	}
}
