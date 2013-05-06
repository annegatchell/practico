public class ProducerConsumer{
	public static void main(String[] args){
		dropProducerConsumer();
	}

	public static void dropProducerConsumer(){
		Drop d = new Drop();
		(new Thread(new Producer(d))).start();
		(new Thread(new Consumer(d))).start();
	}
}