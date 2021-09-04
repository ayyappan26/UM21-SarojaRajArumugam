package com.test.family;
public class Dad {
	protected int income;

	final public void earnMoney() {
		System.out.println("Dad earns money from business");
	}
	//public abstract void play();
	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}
	
}
class Son extends Dad {
	
	public void play() {
		System.out.println("son swims..");
	}
}
