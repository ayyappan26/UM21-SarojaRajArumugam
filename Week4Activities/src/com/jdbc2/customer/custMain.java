package com.jdbc2.customer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class custMain {
	public static void main(String[] args) {
		TableCreation c = new TableCreation();
		ArrayList<String> columnList = null;
		Scanner sc = new Scanner(System.in);
		
		String cName = null;
		String cType = null;
		String key = null;
		System.out.println("Enter the table name:");
		String tName = sc.next();
		System.out.println("Enter the num of columns for the table:");
		int n= sc.nextInt();
		
		HashMap<String,ArrayList<String>> infoMap = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			System.out.println("enter column name"+(i+1));
			cName=sc.next();
			columnList = new ArrayList<>();
			System.out.println("enter column datatype"+(i+1));
			columnList.add(sc.next());
			System.out.println("enter 1 for primary key, else enter 0:");
			columnList.add(sc.next());
			
			infoMap.put(cName, columnList);
		}
			
		try {
		c.createTable(tName,infoMap,n);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
