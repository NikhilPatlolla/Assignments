package com.nikhil.local;


abstract class Loan{
	public abstract void interestRate();
}

interface SBILoan{
	void interest();
	void maxInterestRate();
}

public class AbstractClass {
	public static void main(String[] args) {
		Loan loan = new Loan(){
			@Override
			public void interestRate() {
				System.out.println("Inner anonymous class - Interest rate: 12%");
			}
		};
		
		
		SBILoan sbiLoan = new SBILoan() {

			@Override
			public void interest() {
				System.out.println("10%");
			}

			@Override
			public void maxInterestRate() {
				System.out.println("Max is about 43%");
			}
			
		};
		
		loan.interestRate();
		sbiLoan.interest();
		sbiLoan.maxInterestRate();
	}
}
