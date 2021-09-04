package com.ultramain.training.laptop;

public class Laptop {
	private String make;
	private String model;
	private String companyName;
	private String processorType;
	private int ramSize;
	private int purchasedYear;
	
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getCompanyName() {
		return companyName;
	}
	
	public String getProcessorType() {
		return processorType;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getRamSize() {
		return ramSize;
	}
	public int getPurchasedYear() {
		return purchasedYear;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	public void setCompanyName(String cname) {
		companyName=cname;
	}
	public void setProcessorType(String ptype) {
		processorType=ptype;
	}
	public void setRamSize(int ram) {
		ramSize=ram;
	}
	public void setPurchasedYear(int year) {
		purchasedYear=year;
	}
	
}
