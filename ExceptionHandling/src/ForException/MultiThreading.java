package ForException;


class BathRoom implements Runnable{
	public void run(){
		
		try {
			System.out.println(Thread.currentThread().getName()+" has entered the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is using the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" exited the bathroom");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class MultiThreading {
	public static void main(String[] args) throws InterruptedException {
		
		BathRoom b = new BathRoom();
		// 3 threads are created. A common resource is shared by all the 3 threads.(only one run method) 
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("TIKTOKER");
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
	}

}
