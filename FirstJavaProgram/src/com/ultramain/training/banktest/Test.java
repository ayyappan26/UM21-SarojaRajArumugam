package com.ultramain.training.banktest;

import com.ultramain.training.bank.Bank;

public class Test {
	public static void main(String args[]) {
		Bank.bankName="HDFC";
		
		Bank user1 = new Bank();
		Bank user2= new Bank();
		
		user1.setUserName("Saroja");
		user1.setAccountNum(4567);
		user1.setDepositAmount(8463.78f);
		user1.viewBalance();
		
		user2.setUserName("Thirumurugan");
		user2.setAccountNum(1234);
		user2.setDepositAmount(10000);
		user2.viewBalance();
	}
}
