import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ConsumerColl implements Runnable {
	BlockingQueue<String> drop;

	public ConsumerColl(BlockingQueue<String> drop) {
		this.drop = drop;
	}

	public void run() {
		Random random = new Random();
		String message = "";
		try {
			message = drop.take();
		} catch (InterruptedException e) {}
			
		while(!message.equals("DONE")) {
			System.out.printf("Received message: %s%n", message);
			try {
				Thread.sleep(random.nextInt(4000));
				message = drop.take();
			} catch (InterruptedException e) { }
		}

		System.out.println("Consumer is done receiving messages");
	}
	
}