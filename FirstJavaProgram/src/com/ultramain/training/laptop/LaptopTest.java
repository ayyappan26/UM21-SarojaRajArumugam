package com.ultramain.training.laptop;

public class LaptopTest {
	public static void main(String args[]) {
		Laptop lap1 = new Laptop();
		Display display=new Display();
		
		lap1.setMake("India");
		lap1.setModel("Elitebook");
		lap1.setCompanyName("HP");
		lap1.setProcessorType("i3");
		lap1.setRamSize(4);
		lap1.setPurchasedYear(2020);
		display.displayLaptopDetails(lap1);
		
		Laptop mylap1 = lap1;
		mylap1.setMake("china");
		mylap1.setModel("Inspiron");
		mylap1.setCompanyName("DELL");
		mylap1.setProcessorType("i5");
		mylap1.setRamSize(8);
		mylap1.setPurchasedYear(2021);
		display.displayLaptopDetails(mylap1);
		display.displayLaptopDetails(new Laptop());
		
		
	}
}
