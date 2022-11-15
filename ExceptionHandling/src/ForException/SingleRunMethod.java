package ForException;

public class SingleRunMethod extends Thread{
	
	public void run(){
		String t = Thread.currentThread().getName();
		if(t.equals("BANK")) {
			banking();
		}else if(t.equals("PRINT")) {
			printing();
		}else {
			calc();
		}
	}
	
	public void banking() {
		System.out.println("Banking........");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Banking completed........");
		
	}
	
	public void printing() {
		System.out.println("printing........");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("printing completed........");
		
	}
	
	public void calc() {
		System.out.println("calculating something........");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("calculating completed........");
		
	}
	

	public static void main(String[] args) {
		SingleRunMethod a1 = new SingleRunMethod();
		SingleRunMethod a2 = new SingleRunMethod();
		SingleRunMethod a3 = new SingleRunMethod();
		
		a1.setName("BANK");
		a2.setName("PRINT");
		a3.setName("CALC");
		
		a1.start();
		a2.start();
		a3.start();

	}

}
