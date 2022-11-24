package com.nikhil.local;

abstract class Loan {
	// public abstract int name; //- abstract fields are not permitted
	public abstract void interestRate();
}

interface SBILoan {
	void interest();

	void maxInterestRate();
}

public class AbstractClass {
	public static void main(String[] args) {
		// Implementing anonymous inner class from an abstract class
		Loan loan = new Loan() {
			@Override
			public void interestRate() {
				System.out.println("Inner anonymous class - Interest rate: 12%");
			}
		};

		// Implementing anonymous inner class from interface
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
		Double realdouble = Double.NaN;
		System.out.println(1*Math.pow(12,2));
		
		//String and StringBuilder
		String name = "Teresa";
		StringBuilder sbName = new StringBuilder(name);
		boolean isTrue = sbName.reverse().toString().equals(name);
		System.out.println(isTrue);
	}
}
