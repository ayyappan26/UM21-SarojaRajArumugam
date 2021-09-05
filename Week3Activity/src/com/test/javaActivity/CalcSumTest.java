package com.test.javaActivity;

import java.util.Scanner;

class CalcSum {
	public int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		return sum;
	}
	
}

public class CalcSumTest {
	public static void main(String[] args) {
		CalcSum calc = new CalcSum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int res= calc.calculateSum(n);
		System.out.println("The sum is: "+res);
	}
}
