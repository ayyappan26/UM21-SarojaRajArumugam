package com.ultramain.traing.constructorTest;

// type Casting
//--> Object Casting

public class sample {
	public static void main(String[] args) {
		Dady dd = new Dady();
		Daughters d =new Daughters();
		
		
	}
}

class Dady{
	public Dady(){
		System.out.println("Dad salary is");
	}
	
}

class Daughters extends Dady{
	public Daughters(){
		//this(2000);
		System.out.println("Daughter plays football..");
	}
	
	
}