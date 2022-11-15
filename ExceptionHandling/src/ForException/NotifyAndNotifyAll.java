package ForException;

class Demo extends Thread{
	int total = 0;
	public void run() {
		//sum of first 100 natural numbers
		for(int i =1; i<=100; i++) {
			System.out.println("This thread is running");
			total += i;
		}
	}
}




public class NotifyAndNotifyAll{

	public static void main(String[] args) throws InterruptedException {
		Demo d = new Demo();
		d.start();
		d.join();
		//main thread is started, as both have the same priority
		//this is getting printed before the d thread is executed
		System.out.println(d.total); //0 as the output. 
		//gives 
	}

}
