package com.test.javaActivity;

import java.util.Scanner;

public class CalcDifferenceTest {
	public static void main(String[] args) {
		CalcDiff calc = new CalcDiff();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int res= calc.calculateDifference(n);
		System.out.println("The difference is: "+res);
	}
}
class CalcDiff {
	public int calculateDifference(int n) {
		int sum=(n*(n+1))/2;
		int squareSum = ((n*(n+1))*((2*n)+1))/6;
		int diff = (sum*sum)-squareSum;
		return diff;
	}
}
