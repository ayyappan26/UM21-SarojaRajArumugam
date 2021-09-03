package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListManager {
	public List<String> removeElements(List<String> list1, List<String> list2) {
		list1.clear();
		return list1;
	}
	
	public List<String> getArrayList(String[] a){
		List<String> stringList = new ArrayList<String>();
		
		
		for(String i : a) {
			stringList.add(i);
		}
		Collections.sort(stringList);
		return(stringList);
	}
	
	public static void main(String[] args) {
		ListManager l = new ListManager();
		
		/**
		 * activity1 in collections
		 */
		
//		List<String> l1 = new ArrayList<String>();
//		l1.add("Apple");
//		l1.add("Rose");
//		l1.add("Orange");
//		List<String> l2 = new ArrayList<String>();
//		l2.add("Rose");
//		l2.add("Jasmine");
//		List<String> result=l.removeElements(l1, l2);
//		for(String r : result) {
//			System.out.println(r);
//		}
		
		/**
		 * Activity2
		 */
		
		String arr[] = {"Animals", "Flowers", "Fruits","Animals","Cats"};
		List<String> arrlist=l.getArrayList(arr);
		for(String r : arrlist) {
			System.out.println(r);
		}
		
		
	}
}
