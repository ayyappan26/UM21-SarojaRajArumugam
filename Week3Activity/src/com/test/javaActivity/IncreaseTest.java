package com.test.javaActivity;

import java.util.Scanner;

public class IncreaseTest {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		IncreasingOrder inc = new IncreasingOrder();
		boolean res = inc.checkNumber(n);
		if(res){
			System.out.println(n + " is an increasing number");
		}
		else {
			System.out.println(n+ " is not an increasing number");
		}
	}
}
class IncreasingOrder {
	public boolean checkNumber(int n) {
		int temp=n,digit=0,check=0,curVal,nextVal;
		while(temp!=0) {
			temp/=10;
			digit++;
		}
		int power = (int) Math.pow(10,digit-1);
		curVal=n/power;
		while(power>1) {
			n=n%power;
			nextVal=n/(power/10);
			
			if(curVal<=nextVal) {
				check++;
				curVal=nextVal;
				power/=10;
			}
			else {
				break;
			}
		}
		
		if((digit-check)==1)
			return true;
		else
			return false;
	}
}