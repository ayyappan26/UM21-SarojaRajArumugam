package com.test.collectionExercise;

import java.util.ArrayList;

public class EvenNumbersTest {
	public static void main(String[] args) {
		int n=12;
		EvenNumbers even = new EvenNumbers();
		ArrayList<Integer> a1=even.storeEvenNumber(10);
		ArrayList<Integer> a2=even.printEvenNumber(a1);
		int res = even.retreiveEvenNumber(n, a1);
		if(res!=0)
			System.out.println("The array list contains "+n);
		else
			System.out.println("The array list not contains "+n);
		
	}
}
