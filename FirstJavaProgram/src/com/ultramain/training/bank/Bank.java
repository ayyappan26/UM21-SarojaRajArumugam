package com.ultramain.training.bank;

public class Bank {
	public static String bankName;
	private String userName;
	private int accountNo;
	private float depositAmount;
	
	public static void setBankName(String bankname) {
		bankName=bankname;
	}
	public void setUserName(String uname) {
		userName=uname;
	}
	public void setAccountNum(int accno) {
		accountNo=accno;
	}
	public void setDepositAmount(float amount) {
		if(amount>0)
			depositAmount+=amount;
		else
			System.out.println("Enter a valid amount...");
	}
	public void viewBalance() {
		System.out.println("BankName =" + bankName);
		System.out.println("Customer name =" + userName);
		System.out.println("A/C No =" + accountNo);
		System.out.println("Your Account Balance is =" + depositAmount);
		System.out.println("---------------------------------------------------------------------------------");
	}
}
