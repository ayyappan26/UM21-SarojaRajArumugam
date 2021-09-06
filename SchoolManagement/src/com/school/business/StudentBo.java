package com.school.business;


import com.school.dao.StudentDao;
import com.school.util.Scan;
import com.school.dto.StudentDto;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

public class StudentBo {
	int choice=0;
	Scanner sc = Scan.getScannerInstance();
	StudentDao dao = new StudentDao();
	public void studentSystem() {
		do {
			System.out.println("1. View All the Students Details");
			System.out.println("2. View a particular student");
			System.out.println("3. exit");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				viewAllStudent(dao);
				break;
			case 2 :
				viewStudent(dao);
				break;
			case 3:
				System.out.println("Thank you!");
				return;
			}
			
		}while(choice <= 3);
	}
	
	public void viewAllStudent(StudentDao dao) {
		HashMap<Integer,StudentDto> details = new HashMap<Integer,StudentDto>();
		try {
			details=dao.viewAllStudents();
			dao.printStudentDetails(details);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public void viewStudent(StudentDao dao) {
		HashMap<Integer,StudentDto> details = new HashMap<Integer,StudentDto>();
		System.out.println("ENter a rollno of a student whose details will be displayed:");
		int id = sc.nextInt();
		try {
			
			details=dao.viewStudent(id);
			dao.printStudentDetails(details);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
	
