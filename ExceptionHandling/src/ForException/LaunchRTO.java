package ForException;

import java.util.Scanner;

class UnderAgeException extends Exception { 
	UnderAgeException(String msg){
		super(msg);
	}
}

class OverAgeException extends Exception {
	OverAgeException(String msg){
		super(msg);
	}
}


class LApp {
	private int age;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dear kindly enter your age to check the eligibility");
		age = scan.nextInt();
		}
	
	public void verify() throws OverAgeException, UnderAgeException { //try and throw the most strict exception instead of Exception
		if(age>60){
			System.out.println("You're NOT eligible");
			throw new OverAgeException("Your time is near be careful");
			
		} else if(age>=18) {
			System.out.println("You are eligible");
			
			
		}else if(age<18) {

			throw new UnderAgeException("Your time is near be careful");
			
		}else {
			System.out.println("Dude!, calm down take it slow");
		}
	}
	
}


class RTO {
	void initiate(){
		LApp la = new LApp();
		try {
			la.input();
			la.verify();
		} catch(OverAgeException | UnderAgeException e) {
			try {
				la.input();
				la.verify();
			} catch(UnderAgeException | OverAgeException a) {
				System.out.println("Seems suspicious");
				System.exit(0);
			}
		}
	}
}




public class LaunchRTO {

	public static void main(String[] args) {
		RTO rto = new RTO();
		rto.initiate();

	}

}
