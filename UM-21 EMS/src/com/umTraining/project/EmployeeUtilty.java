package com.umTraining.project;

import java.util.Scanner;

public class EmployeeUtilty {
	private static Scanner scanner;
	private EmployeeUtilty() {}
	public static Scanner getScannerInstance() {
		if(scanner == null) {
			scanner=new Scanner(System.in);
		}
		return scanner;
	}
	

}
