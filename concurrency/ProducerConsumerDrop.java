public class ProducerConsumerDrop {
	public static void main(String[] args) {
		Drop drop = new Drop();
		Producer producer = new Producer(drop);
		Consumer consumer = new Consumer(drop);
		Thread pThread = new Thread(producer);
		Thread cThread = new Thread(consumer);
		pThread.start();
		cThread.start();
	}
}