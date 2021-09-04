package com.ultramain.training.basics;

import java.util.Scanner;

public class PrimeNumbers{
	public static void main(String args[]){
		try (Scanner obj = new Scanner(System.in)) {
			int n = obj.nextInt();
			int flag=0;
			for(int i=2;i<=n;i++) {
				flag=0;
				for(int j=2;j<i;j++) {
					if(i%j==0)
					{	flag=1;
						break;
					}
					
				}
				if(flag==0)
					System.out.println(i);
			}
		}
		
	}
}