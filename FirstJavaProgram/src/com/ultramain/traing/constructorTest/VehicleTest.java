package com.ultramain.traing.constructorTest;
//This code tests constructor chaining with the help of inheritance concept..

public class VehicleTest {
	public static void main(String args[]) {
		MaruthiCar myCar = new MaruthiCar();
	}
}
class Vehicle{
	public Vehicle() {
		System.out.println("In Vehicle......");
	}
	public Vehicle(int a) {
		System.out.println(a);
	}
	
}
class Car extends Vehicle{
	public Car() {
		this("heyyy");
		System.out.println("In Car...");
	}
	public Car(String msg) {
		System.out.println(msg);
	}
}
class MaruthiCar extends Car{
	public MaruthiCar() {
		System.out.println("Maruthi Car...");
	}
}