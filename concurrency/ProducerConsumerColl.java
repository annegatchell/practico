import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerColl {
	public static void main(String[] args) {
		BlockingQueue<String> drop = new SynchronousQueue<String>();
		ProducerColl producer = new ProducerColl(drop);
		ConsumerColl consumer = new ConsumerColl(drop);
		Thread pThread = new Thread(producer);
		Thread cThread = new Thread(consumer);
		pThread.start();
		cThread.start();
	}
}