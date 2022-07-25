package com.hcl.AS3;

public class Bank {

	
	int Deposit(int amount, int balance) {
		
		return amount + balance;
	};
	
	int Withdraw(int amount, int balance) {
		
		if(balance >= amount) {
			return balance - amount;
			
		}
		else {
			return 0;
		}
		
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
