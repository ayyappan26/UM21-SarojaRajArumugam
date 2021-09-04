package com.ultramain.traing.constructorTest;

// method overloading
public class StaticPolymorphism {
	public static void main(String[] args) {
		Daughter d =new Daughter();
		d.play();
		d.earnMoney();
		d.earnMoney("Freelancing");
	}
}
class Dad{
	public Dad(){
		this(10000);
	}
	public Dad(int salary){
		System.out.println("Dad salary is"+ salary);
	}
	public void earnMoney() {
		System.out.println("Dad earns money...");
	}
}

class Daughter extends Dad{
	public Daughter(){
		//this(2000);
	}
	public Daughter(int salary){
		System.out.println("Daugter salary is"+ salary);
	}
	public void play(){
		System.out.println("Daughter plays football..");
	}
	public void earnMoney(String jobType) {
		System.out.println("Daughter earns money from... "+ jobType);
	}
	
}