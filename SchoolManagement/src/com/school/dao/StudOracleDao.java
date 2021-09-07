package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.data.DBConnect;
import com.school.dto.StudentDto;

public class StudOracleDao implements Idao{
	public HashMap<Integer,StudentDto> viewAllStudents() throws SQLException{
		HashMap<Integer,StudentDto> studMap = new HashMap<Integer,StudentDto>();
		
		StudentDto sdto = null;
		Connection con = DBConnect.getDbConnection();
		String sqlQuery = "SELECT * FROM student";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlQuery);
		
		int rollno;
		
		while(rs.next()) {
			sdto = new StudentDto();
			rollno = rs.getInt(1);
			sdto.setRollno(rs.getInt(1));
			sdto.setName(rs.getString(2));
			sdto.setCourse(rs.getString(3));
			sdto.setYear(rs.getInt(4));
			sdto.setPercentage(rs.getFloat(5));	
			
			studMap.put(rollno,sdto);
		}
		return(studMap);		
	}
	
	public HashMap<Integer,StudentDto> viewStudent(int id) throws SQLException{
		HashMap<Integer,StudentDto> studMap = new HashMap<Integer,StudentDto>();
		
		StudentDto sdto = new StudentDto();
		Connection con = DBConnect.getDbConnection();
		String sqlQuery = "SELECT * FROM student where rollno =" + id;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlQuery);
		rs.next();
		sdto.setRollno(rs.getInt(1));
		sdto.setName(rs.getString(2));
		sdto.setCourse(rs.getString(3));
		sdto.setYear(rs.getInt(4));
		sdto.setPercentage(rs.getFloat(5));
		
		studMap.put(id,sdto);
		return(studMap);		
	}
	public void printStudentDetails(HashMap<Integer,StudentDto> h1) {
		
		for(Integer key : h1.keySet() ) {
			System.out.println("Roll no       : "+ key);
			System.out.println("Student Name  : "+h1.get(key).getName());
			System.out.println("Course        : "+h1.get(key).getCourse());
			System.out.println("Year          : "+h1.get(key).getYear());
			System.out.println("Percentage    : "+h1.get(key).getPercentage());
			System.out.println("________________________________________________");
			
		}
	}

	
	public HashMap<String, ArrayList<StudentDto>> viewAllByDepartments() throws SQLException {
		HashMap<String,ArrayList<StudentDto>> deptMap = new HashMap<>();
		ArrayList<String> deptList = new ArrayList<>();
		ArrayList<StudentDto> studDetail = new ArrayList<>();
		String sqlQuery = "SELECT DISTINCT course from student";
		StudentDto sdto = null;
		
		Connection con = DBConnect.getDbConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlQuery);
		
		String course;
		
		while(rs.next()) {
			deptList.add(rs.getString(1));
		}
		for(String dept : deptList) {
			studDetail = viewStudentByDepartment(dept);
			deptMap.put(dept, studDetail);
		}
		return(deptMap);
	}

	
	public ArrayList<StudentDto> viewStudentByDepartment(String deptname) throws SQLException {
		ArrayList<StudentDto> deptList = new ArrayList<StudentDto>();
		StudentDto sdto = null;
		Connection con = DBConnect.getDbConnection();
		String sqlQuery = "SELECT * FROM student WHERE course=?";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		pst.setString(1, deptname);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			sdto = new StudentDto();
			sdto.setRollno(rs.getInt(1));
			sdto.setName(rs.getString(2));
			sdto.setCourse(rs.getString(3));
			sdto.setYear(rs.getInt(4));
			sdto.setPercentage(rs.getFloat(5));
			
			deptList.add(sdto);
		}
		return deptList;
	}
}
