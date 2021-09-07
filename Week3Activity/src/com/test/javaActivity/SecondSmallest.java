package com.test.javaActivity;

import java.util.ArrayList;
import java.util.Collections;

class FindSmall{
	public int getSecondSmallest(int[] a) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		for(int i : a) {
			aList.add(i);
		}
		Collections.sort(aList);
		
		return aList.get(1);
	}
}

public class SecondSmallest {
	public static void main(String[] args) {
		int a[] = {4,2,1,9,5};
		FindSmall f = new FindSmall();
		int res = f.getSecondSmallest(a);
		System.out.println("The second smallest element of the given array is : "+res);
	}
}
