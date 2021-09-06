package com.ultramain.business;

import java.sql.SQLException;
import java.util.Scanner;
import com.ultramain.dao.EmployeeDao;
import com.ultramain.dto.EmployeeDto;
import com.ultramain.util.Scan;

public class EmployeeBo {

	public void empSystem() {
		int choice;
		EmployeeDao dao = new EmployeeDao();
		Scanner scan = Scan.getScannerInstance();
		
		do {
			System.out.println("1. View Employee");
			System.out.println("2. Register Employee");
			System.out.println("3.Update employee");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
		
			switch(choice) {
			case 1:
				viewEmployees(dao);
				break;
			case 2:
				registerEmployee(dao);
				break;
			case 3:
				updateEmployee(dao);
				break;
			
			case 4:
				System.out.println("Thank you for using!..");
				return;
			}
		}while(choice<=3);
	}
		
		public void viewEmployees(EmployeeDao dao){
			try {
				dao.viewEmployees();
			} 
			catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
		}
		public void registerEmployee(EmployeeDao dao){
			EmployeeDto empDto = getEmpDetails();
			try {
				dao.registerEmployee(empDto);
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
		}
		public void updateEmployee(EmployeeDao dao){
			EmployeeDto empDto = getEmpDetails();
			try {
				dao.updateEmployee(empDto);
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
		}
		private EmployeeDto getEmpDetails(){
			Scanner scan = Scan.getScannerInstance();
			EmployeeDto empDto = new EmployeeDto();
			System.out.println("Enter Employee Id: ");
			empDto.setEmpId(scan.nextInt());
			System.out.println("Enter First Name : ");
			empDto.setFirstName(scan.next());
			System.out.println("Enter Last Name : ");
			empDto.setLastName(scan.next());
			System.out.println("Enter Salary : ");
			empDto.setSalary(scan.nextFloat());
			System.out.println("Enter Mobile : ");
			empDto.setMobile(scan.nextInt());
			System.out.println("Enter Department : ");
			empDto.setDepartment(scan.next());		
			return empDto;
			
		}
		
	}

