package com.school.business;


import com.school.dao.Idao;
import com.school.dao.StudOracleDao;
import com.school.util.Scan;
import com.school.dto.StudentDto;
import com.school.factories.AbstractFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentBo {
	int choice=0;
	Scanner sc = Scan.getScannerInstance();
	AbstractFactory factory = AbstractFactory.getFactory(1);
	StudOracleDao oracDao = new StudOracleDao();
	Idao dao = factory.getDao();
	public void studentSystem() {
		do {
			System.out.println("1. View All the Students Details");
			System.out.println("2. View a particular student by his rollno");
			System.out.println("3. View All the Students Details by their respctive department");
			System.out.println("4. View a particular Department student details");
			System.out.println("5. exit");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				viewAllStudent(oracDao);
				break;
			case 2 :
				viewStudent(oracDao);
				break;
			case 3 :
				viewAllByDepartment(dao);
				break;
			case 4:
				viewStudentByDepartment(dao);
				break;
			case 5:
				System.out.println("Thank you!");
				return;
			}
			
		}while(choice <= 5);
	}
	
	public void viewAllStudent(StudOracleDao dao) {
		HashMap<Integer,StudentDto> details = new HashMap<Integer,StudentDto>();
		try {
			details=dao.viewAllStudents();
			dao.printStudentDetails(details);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public void viewStudent(StudOracleDao dao) {
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
	
	public void viewStudentByDepartment(Idao dao) {
		ArrayList<StudentDto> details = new ArrayList<StudentDto>();
		System.out.println("ENter a department name:");
		String dept = sc.next();
		try {
			
			details=dao.viewStudentByDepartment(dept);
			for(StudentDto s : details ) {
				System.out.println("Roll no       : "+ s.getRollno());
				System.out.println("Student Name  : "+ s.getName());
				System.out.println("Course        : "+ s.getCourse());
				System.out.println("Year          : "+ s.getYear());
				System.out.println("Percentage    : "+ s.getPercentage());
				System.out.println("------------------------------------------------");
				
			}
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void viewAllByDepartment(Idao dao) {
		HashMap<String,ArrayList<StudentDto>> detailsMap = new HashMap<>();
		ArrayList<StudentDto> list = new ArrayList<>();
		System.out.println("Enter the departmentname");
		String dept = Scan.getScannerInstance().next();
		try {
			detailsMap = dao.viewAllByDepartments();
			list = detailsMap.get(dept);
			for(StudentDto s : list) {
				System.out.println("Roll no       : "+ s.getRollno());
				System.out.println("Student Name  : "+ s.getName());
				System.out.println("Course        : "+ s.getCourse());
				System.out.println("Year          : "+ s.getYear());
				System.out.println("Percentage    : "+ s.getPercentage());
				System.out.println("------------------------------------------------");
			}			
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
	
