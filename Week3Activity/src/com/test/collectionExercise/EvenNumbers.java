package com.test.collectionExercise;

import java.util.ArrayList;

public class EvenNumbers {
	public ArrayList<Integer> storeEvenNumber(int n){
		ArrayList<Integer> A1 = new ArrayList<Integer>();
		for(int i=2;i<=n;i+=2)
			A1.add(i);
		return A1;
	}
	public ArrayList<Integer> printEvenNumber(ArrayList<Integer> a){
	
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		for(Integer i : a) {
			System.out.println(i);
			A2.add(i*2);
		}
		return A2;
	}
	public int retreiveEvenNumber(int n,ArrayList<Integer> A1) {
		if(A1.contains(n)) {
			return n;
		}
		else {
			return 0;
		}
	}
}
