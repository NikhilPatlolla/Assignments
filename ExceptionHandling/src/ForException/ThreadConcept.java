package ForException;

class Demo1 extends Thread{
	public void run(){
		System.out.println("banking task started");
		for(int i=0; i<3; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Banking........");
		}
		System.out.println("Banking completed........");
		System.out.println("-------------------------");
	}
}


class Demo2 extends Thread{
	public void run() {
		System.out.println("printing activity");
		
		for(int i=0; i<3; i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing.......");
		}
		System.out.println("Printing completed........");
		System.out.println("-------------------------");
		
	}
}

class Demo3 extends Thread{
	public void run(){
		System.out.println("Calculation task started");
		
		for(int i=0; i<3; i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("some calculation.......");
		}
		System.out.println("calculation completed........");
		System.out.println("-------------------------");
	}
}

public class ThreadConcept {

	public static void main(String[] args) throws Exception {
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		d1.start();
		d2.start();
		d3.start();
		
		}
}
