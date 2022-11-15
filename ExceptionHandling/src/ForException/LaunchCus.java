package ForException;

import java.util.Scanner;

class InvalidUserException extends Exception {  // our user defined Exception calls that is a child of Exception class
	InvalidUserException(){
		System.out.println("New obj is created");
	}
	
	InvalidUserException(String msg){
		super(msg);
		System.out.println("The obj of the exception is created" + msg);
	}
		
}


class ATM {
	private int accountNum = 1111; 
	private int password = 2222;
	private int accNo; // to be able to assign in the input() method and compare them in another method
	private int pw; 
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the account number");
		accNo = scan.nextInt();
		System.out.println("Enter the password");
		pw = scan.nextInt();
	}
	
	public void verify() throws InvalidUserException{
		if(accountNum == accNo && password == pw) {
			System.out.println("Collect your cash");
		} else {
//			InvalidUserException iue = new InvalidUserException(); //this is the Custom defined exception, therefore we need to create an obj to use
//			System.out.println("Invalid credentials");
////			throw new InvalidUserException();  this can be used when you do not create the obj of the exception
//			throw iue;  // re-throwing the exception to the called function
			throw new InvalidUserException("Invalid credentials"); // to print the error message, we use the getMessage() method. 
            // the above method is preferred. 
		}
	}
}


class Bank {
	public void initiate() {
		
		ATM a = new ATM(); // keeping it out of the try block as it will be used in the nested try blocks. 
		
		try {
			a.input();
			a.verify();
		} catch (InvalidUserException e) {
			
			try{
				System.out.println(e.getMessage());
				a.input();
			    a.verify();
			} catch (InvalidUserException f) {
				
				try {
					System.out.println(f.getMessage());
					a.input();
					a.verify();
				} catch (InvalidUserException g) {
					System.out.println("Card is blocked! Bye");
					System.out.println(g.getMessage()); //
					System.exit(0);
				}
			}
		}
	}
}
// we write the try and catch methods as many times as we need the ATM attempts. 


class Check {
	public final String names = new String("there");
	
}

public class LaunchCus {

	public static void main(String[] args) {
		
		final String name = "name";
		Check c = new Check();
//		name = "Hello";
		System.out.println(c.names);
        Integer I = Integer.valueOf("10");
        System.out.println(I);
	}

}
