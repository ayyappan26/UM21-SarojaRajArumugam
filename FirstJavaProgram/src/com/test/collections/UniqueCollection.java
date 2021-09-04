package com.test.collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class UniqueCollection {
	public TreeSet<String> getCollection(String[] s) {

		TreeSet<String> tSet = new TreeSet<String>();
		for (String i : s) {
			tSet.add(i);
		}
		
		return (tSet);
	}
	
	public static void main(String[] args) {
		UniqueCollection unique = new UniqueCollection();
		TreeSet<String> res = new TreeSet<String>();
		String[] str = {"Array","ArrayList","Java","Array","Buffers"};
		res = unique.getCollection(str);
		for(String x: res) {
			System.out.println(x);
		}
	}

}
