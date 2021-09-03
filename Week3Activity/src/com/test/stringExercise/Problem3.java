package com.test.stringExercise;



/**
 * @author Saroja
 * 
 * Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format.
Drive: c:\
Folders: IBM || DB2 || PROGRAM 
File: DB2COPY1.EXE

Hint:  Use String Builder for concatenating the folder names with |.

 *
 */
public class Problem3 {
	public static void main(String[] args) {
		
		String strBuilder = new String();
		String s = new String("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
		System.out.println("Drive: "+s.substring(0,s.indexOf("\\")+1));
		
		System.out.println(strBuilder);
		System.out.println("File: "+s.substring(s.lastIndexOf("\\")+1));
	}
}
