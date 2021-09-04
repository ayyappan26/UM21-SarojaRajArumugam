package com.ultramain.training.laptop;

public class Display {
	public void displayLaptopDetails(Laptop myLaptop) {
		System.out.println("Laptop Made in  :"+ myLaptop.getMake());
		System.out.println("Laptop Model  :"+ myLaptop.getModel());
		System.out.println("company name  :"+ myLaptop.getCompanyName());
		System.out.println("processor type  :"+ myLaptop.getProcessorType());
		System.out.println("RAM Size  :"+ myLaptop.getRamSize());
		System.out.println("Purchased year  :"+ myLaptop.getPurchasedYear());
		System.out.println("**********************************************************");
	}
}
