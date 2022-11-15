package ForException;

class Ineuron{
	public void run() {
		try {
			
		}catch(Exception e) {
			System.out.println("Java is best to understand coding");
			e.printStackTrace();
		}
	}
}

public class DaemonThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println(t.isDaemon());
		
		Ineuron i = new Ineuron();
		Thread t1 = new Thread();
		System.out.println(t1.isDaemon());
		t1.start();
		t1.setDaemon(true);
		
		System.out.println(t1.isDaemon());

	}

}
