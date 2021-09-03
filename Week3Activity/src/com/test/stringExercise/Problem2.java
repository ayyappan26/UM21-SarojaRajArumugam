package com.test.stringExercise;



/**
 * @author HP
 * Write a program which creates a StringBuffer “This is StringBuffer” and performs the following. 
1.	Adds the string ”- This is a sample program” to existing string and display it.
2.	Inserts the string “Object” into the existing string at 21st postion and display it.
3.	Reverses the entire string and displays it.
4.	Replaces the word “Buffer” with “Builder” and display it.

 *
 */
public class Problem2 {
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("This is StringBuffer");
		s.append(" This is a sample program");
		System.out.println(s);
		s.insert(20, " Object");
		System.out.println(s);
		StringBuffer s1 = new StringBuffer(s);
		
		System.out.println(s.reverse());
		System.out.println(s1.replace(14, 21, "Builder "));
		
	}
}
