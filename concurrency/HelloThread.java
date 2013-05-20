public class HelloThread extends Thread {
	public void run() {
		System.out.println("Hello from a thread class ");
	}

	public static void main(String[] args) {
		(new HelloThread()).start();
	}
}