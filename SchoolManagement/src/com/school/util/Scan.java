package com.school.util;

import java.util.Scanner;

public class Scan {
	private static Scanner scan =null;
	public static Scanner getScannerInstance() {
		if(scan == null) {
			scan = new Scanner(System.in);
		}
		return scan;
	}
}
