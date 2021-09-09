package com.jdbc1.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.data.DBConnect;

public class EmployeeUploader {
	public void storeDepartmentDetails(int deptId,String deptName,String deptHead,String deptDescription) throws SQLException {
		Connection con = DBConnect.getDbConnection();
		
		String sQuery = "INSERT INTO department VALUES(?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sQuery);
		pst.setInt(1, deptId);
		pst.setString(2, deptName);
		pst.setString(3, deptHead);
		pst.setString(4, deptDescription);
		int rowsUpdated=pst.executeUpdate();
		
		System.out.println("rows updated :" + rowsUpdated);
	}
	
	private boolean isPresentEmployeeId(int id) throws SQLException{
		boolean flag= false;
		Connection con = DBConnect.getDbConnection();
		String sQuery = "SELECT employee_id FROM employeee";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sQuery);
		
		ArrayList<Integer> empIdList = new ArrayList<>();
		while(rs.next()) {
			empIdList.add(rs.getInt(1));
		}
		if(empIdList.contains(id))
			flag=true;
		return flag;
	}
	
	private boolean isPresentDeptId(int id) throws SQLException{
		boolean flag= false;
		Connection con = DBConnect.getDbConnection();
		String sQuery = "SELECT department_id FROM department";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sQuery);
		
		ArrayList<Integer> depIdList = new ArrayList<>();
		while(rs.next()) {
			depIdList.add(rs.getInt(1));
		}
		if(depIdList.contains(id))
			flag=true;
		return flag;
	}
	public void storeEmployeeDetails(int empId,String name,String address,double salary,int mobile,int depId) throws SQLException{
		Connection con = DBConnect.getDbConnection();
		if(!isPresentEmployeeId(empId) && isPresentDeptId(depId) && salary>=1000) {
			String sQuery = "INSERT INTO employeee VALUES(?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sQuery);
			pst.setInt(1, empId);
			pst.setString(2, name);
			pst.setString(3, address);
			pst.setDouble(4, salary);
			pst.setInt(5, mobile);
			
			pst.setInt(6, depId);
			
			int rowsUpdated=pst.executeUpdate();
			
			System.out.println("rows updated :" + rowsUpdated);
		}
		else {
			if(isPresentEmployeeId(empId))
				System.out.println("Employee Id is alrady exist!..pls enter different employee id..");
			else if(!isPresentDeptId(depId))
				System.out.println("Invalid department id..");
			else
				System.out.println("Salary should be greater than 1000!..");
		}
	}
	
	public void retreiveEmployeeDetails(int empId) throws SQLException{
		Connection con = DBConnect.getDbConnection();
		
		
		if(isPresentEmployeeId(empId)) {
			String displayEmpQuery = "select employee_id,employee_name,emp_address,contact,dep_id from employeee WHERE employee_id=?";
			PreparedStatement pst = con.prepareStatement(displayEmpQuery);
			pst.setInt(1, empId);
			ResultSet details = pst.executeQuery();
			details.next();
			System.out.println("Employee_Id : "+details.getInt(1));
			System.out.println("Employee_Name : "+details.getString(2));
			System.out.println("Employee_Address : "+details.getString(3));
			System.out.println("Employee_Contactno :"+details.getInt(4));
			int depId = details.getInt(5);
			String displayDeptQuery = "SELECT department_name,dept_head FROM department WHERE department_id = ?";
			pst = con.prepareStatement(displayDeptQuery);
			pst.setInt(1, depId);
			ResultSet deptSet = pst.executeQuery();
			deptSet.next();
			System.out.println("Department_name : "+ deptSet.getString(1));
			System.out.println("Department_head : " + deptSet.getString(2));
			}
		else {
			System.out.println("Invalid employee Id..");
		}
	}
}

