package com.test.javaActivity;

import java.util.HashMap;

class Scolarship {
	public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> stud){
		HashMap<Integer,String> medalist = new HashMap<Integer,String>();
		for(Integer key : stud.keySet()) {
			if(stud.get(key)>=90)
				medalist.put(key, "Gold");
			else if(stud.get(key)>=80 && stud.get(key)<90)
				medalist.put(key, "Silver");
			else if(stud.get(key)>=70 && stud.get(key)<80)
				medalist.put(key, "Bronze");
		}
		return(medalist);
	}
}

public class ScolarshipTest{
	public static void main(String[] args) {
		Scolarship s = new Scolarship();
		HashMap<Integer,Integer> studDetails = new HashMap<Integer,Integer>();
		studDetails.put(101, 70);
		studDetails.put(102, 88);
		studDetails.put(103, 95);
		
		HashMap<Integer,String> resultMap = s.getStudents(studDetails);
		for(Integer i : resultMap.keySet())
			System.out.println(i+" : "+ resultMap.get(i));
		
	}
}
