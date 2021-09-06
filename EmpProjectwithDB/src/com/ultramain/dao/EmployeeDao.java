package com.ultramain.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.data.DataConnect;
import com.ultramain.dto.EmployeeDto;

/**
 * @author Saroja
 * Data Access Object class
 *
 */
public class EmployeeDao {
	public void viewEmployees() throws SQLException {
		Connection con = DataConnect.getDbConnection();
		String sqlQuery = "SELECT * from emp";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlQuery);
		
		int employee_id;
		String first_name;
		String last_name;
		float salary;
		int mobile;
		String department;
		
		while(rs.next()) {
			employee_id=rs.getInt(1);
			first_name=rs.getString(2);
			last_name=rs.getString(3);
			mobile=rs.getInt(4);
			salary=rs.getFloat(5);
			department=rs.getString(6);
			
			System.out.println("Employee Id :"+employee_id);
			System.out.println("First name  :"+first_name );
			System.out.println("Last name   :"+ last_name);
			System.out.println("Mobile :"+mobile );
			System.out.println("Salary :"+salary );
			System.out.println("Department :"+ department);
			System.out.println("_____________________________________________");
		}
	}
	public void viewEmp(int id) throws SQLException {
		Connection con = DataConnect.getDbConnection();
		String sqlQuery = "SELECT * from emp where empId=?";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		pst.setInt(1, id);
		
	}

	public void registerEmployee(EmployeeDto empDto) throws SQLException{
		Connection con = DataConnect.getDbConnection();
		String sqlQuery = "INSERT INTO emp VALUES(?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		pst.setInt(1,empDto.getEmpId());
		pst.setString(2, empDto.getFirstName());
		pst.setString(3, empDto.getLastName());
		pst.setInt(4, empDto.getMobile());
		pst.setFloat(5, empDto.getSalary());
		pst.setString(6, empDto.getDepartment());
		
		int rowsUpdated = pst.executeUpdate();
		
		System.out.println("Row Inserted: "+ rowsUpdated);
		
	}
	
	
	public void updateEmployee(EmployeeDto empDto) throws SQLException{
		Connection con = DataConnect.getDbConnection();
		String sqlQuery = "UPDATE emp SET salary = ? where empId = ?";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		
		pst.setFloat(1, empDto.getSalary());
		pst.setInt(2,empDto.getEmpId());
				
		int rowsUpdated = pst.executeUpdate();
		
		System.out.println("Row Inserted: "+ rowsUpdated);
		
	}
	
}
