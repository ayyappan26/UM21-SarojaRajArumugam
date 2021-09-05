package com.test.javaActivity;

import java.util.Scanner;

public class PowerNumberTest {
	public static void main(String[] args) {
		PowerNumber p = new PowerNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		boolean res = p.checkNumber(n);
		if(res==true)
			System.out.println(n+" is a power of 2");
		else
			System.out.println("It is not a power of 2");
	}
}

class  PowerNumber{
	public boolean checkNumber(int n) {
		int i=1,temp=n;
		while(n!=1) {
			if(n%2==0) {
				i*=2;
			}
			else {
				break;
			}
			n/=2;
		}
		if(temp==i)
			return true;
		else
			return false;
	}
}