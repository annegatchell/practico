import java.util.Random;

public class Consumer implements Runnable {
	Drop drop;

	public Consumer(Drop drop) {
		this.drop = drop;
	}

	public void run() {
		Random random = new Random();
		String message = drop.take();
		while(!message.equals("DONE")) {
			System.out.printf("Received message: %s%n", message);
			// try {
			// 	Thread.sleep(random.nextInt(4000));
			// } catch (InterruptedException e) { }
			message = drop.take();
		}

		System.out.println("Consumer is done receiving messages");
	}

}