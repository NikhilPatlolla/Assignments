package ForException;

class Banking implements Runnable{

	@Override
	public void run() {
		System.out.println("Banking........");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Banking completed........");
		
	}
	
}

class Printing implements Runnable{

	@Override
	public void run() {
		System.out.println("printing........");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("printing completed........");
		
	}
	
}

class Calculating implements Runnable{

	@Override
	public void run() {
		System.out.println("calculating something........");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("calculating completed........");
		
	}
	
}



public class RunnableThread{

	public static void main(String[] args) {
		Banking b1 = new Banking();
		Printing p1 = new Printing();
		Calculating c1 = new Calculating();
		
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(p1);
		Thread t3 = new Thread(c1);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
