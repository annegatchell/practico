import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ProducerColl implements Runnable{
	BlockingQueue<String> drop;

	public ProducerColl(BlockingQueue<String> drop) {
		this.drop = drop;
	}

	public void run() {
		Random random = new Random();
		String[] importantInfo = {
				"In every job that must be done",
				"There is an element of fun.",
				"You find the fun, and",
				"SNAP!",
				"The job's a game!",
				"And every task you undertake",
				"Becomes a piece of cake",
				"A lark!",
				"A scream!",
				"It's very clear to",
				"seeeeeeee",
				"That a",
				"Spoonfull of sugar",
				"Helps the medicine go down",
				"The medicine go dooooooown",
				"Medicine go down!",
				"",
				"Just a spoonfull of sugar",
				"helps the medicine go down",
				"In a most delightful way!",
				".........."
			};
		for(String s : importantInfo) {
			try{
				drop.put(s);
				Thread.sleep(random.nextInt(4000));
			} catch (InterruptedException e) {}
		}
		try {
			drop.put("DONE");
		} catch (InterruptedException e) { }
		System.out.println("Producer is done!");
	}
	
}