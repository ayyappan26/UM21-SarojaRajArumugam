package com.jdbc2.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.HashMap;

import com.data.DBConnect;

public class TableCreation {
	public void createTable(String tableName,HashMap<String,ArrayList<String>> columnInfo,int n)throws SQLException {
		Connection con = DBConnect.getDbConnection();
		ArrayList<String> columnList = null;
		String PK = " PRIMARY KEY";
		int c=0;
		String createQuery="";
		for(String s: columnInfo.keySet()) {
			columnList=new ArrayList<>();
			columnList = columnInfo.get(s);
			createQuery+=s+" "+columnList.get(0);
			c+=1;
			if(columnList.get(1).equals("1")) {
				createQuery+=PK;
			}
			if(c!=n)
				createQuery+=",";
		}
//		System.out.println(createQuery);
//		System.out.println(tableName);
		String sqlQuery = "CREATE TABLE "+ tableName+" (" +createQuery+" )";
//		System.out.println(sqlQuery);
		PreparedStatement pst = con.prepareStatement(sqlQuery);
//		pst.setString(1, tableName);
//		pst.setString(2, createQuery);
		
		pst.executeUpdate();
		System.out.println("TABLE CREATED ...");
	}
}
