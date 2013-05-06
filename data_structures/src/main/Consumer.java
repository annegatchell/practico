import java.util.Random;

public class Consumer implements Runnable{
	private Drop drop;

	public Consumer(Drop drop){
		this.drop = drop;
	}

	public void run(){
		Random random = new Random();
		int i = 0;
		for(String message = drop.take();
			!message.equals("DONE");
			message = drop.take()){
			
			System.out.format("MESSAGE RECEIVED: %s%n", message);
			//Wait for a random time period
			try{
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {}
		}
	}
}