package com.ultramain.training.inheritance;

// This program is about Inheritance types
// 1. is-a relationship
// 2. has-a relationship
public class VehicleTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.steer();
		myCar.horn();
		myCar.numwheels();
	}
}

class Vehicle{
	public void steer() {
		System.out.println("vehicle has own steering..");
	}
	public void horn() {
		System.out.println("Vehicle has electric horn");
	}
}
class Car extends Vehicle{//car is-a Vehicle
	public void horn() {
		System.out.println("car has air horn");
	}
	public void numwheels() {
		System.out.println(new Wheel().wheelcount("Car")+" Wheels");
	}
}
class Wheel{//Car has-a no.of wheels
	public int wheelcount(String vType) {
		if(vType.equals("Car")) {
			return(4);
		}
		return 0;
	}
}