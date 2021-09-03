package com.test.stringExercise;

/**
 * @author Saroja
 * Write a program which creates a String “Welcome to Java World” and performs the following 
•	Returns the character at 5th position and display it.
•	Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
•	Concatenates “- Let us learn” to the above string and display it.
•	Returns the position of the first occurrence of character ‘a’ and display it.
•	Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
•	Returns string between 4th position and 10th position and display it.
•	Returns the lowercase of the string and display it.

 *
 */
public class Problem1 {
	public static void main(String[] args) {
		String s1 = "Welcome to Java World";
		System.out.println("5 th character is :"+ s1.charAt(4));
		int retVal=s1.compareTo("Welcome");
		System.out.println(retVal);
		s1+=" Let us Learn";
		System.out.println(s1);
		System.out.println("First occurence of a is "+s1.indexOf("a"));
		String s2=s1.replace("a", "e");
		System.out.println("After replacement");
		System.out.println(s2);
		System.out.println(s1.substring(4,10));
		System.out.println(s1.toLowerCase());
	}

}
