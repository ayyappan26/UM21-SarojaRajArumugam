package com.ultramain.training.constructorsceck;

public class Greet {
	int time;
	public Greet() {
		time=6;
	}
	public Greet(int time) {
		this.time=time;
	}
	public void greetMessage() {
		greetMorning();
		greetEvening();
	}
	public void greetMorning() {
		System.out.println("Happy Morning!..");
	}
	public void greetEvening() {
		System.out.println("good Evening!..");
		this.greetNight();
	}
	public void greetNight() {
		if(time>20)
			System.out.println("good Night!,Sleep well...");
	}
}
