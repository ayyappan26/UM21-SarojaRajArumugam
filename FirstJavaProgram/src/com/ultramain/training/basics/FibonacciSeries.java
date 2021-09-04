package com.ultramain.training.basics;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		int a,b,c,n,temp;
		a=0;
		b=1;
		c=a+b;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		temp=1;
		System.out.println(a);
		System.out.println(b);
		while(temp<=n) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
			temp++;
		}
	}
}
