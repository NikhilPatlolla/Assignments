package com.nikhil.main;


abstract class Loan{
	public abstract void interestRate();
}


public class AbstractClass {
	public static void main(String[] args) {
		Loan loan = new Loan(){
			@Override
			public void interestRate() {
				System.out.println("Inner anonymous class - Interest rate: 12%");
			}
		};
		
		loan.interestRate();
	}
}
