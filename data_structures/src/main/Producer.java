import java.util.Random;

public class Producer implements Runnable{
	private Drop drop;

	public Producer(Drop d){
		this.drop = d;
	}

	public void run(){
		String importantInfo[] = {
			"Mare eats oats",
			"Does eat oats",
			"Little lamb eats ivy",
			"A kid will eat ivy too"
		};

		Random rand = new Random();

		for(int i = 0; i < importantInfo.length; i++){
			drop.put(importantInfo[i]);
			
			try{
				Thread.sleep(rand.nextInt(1000));
			} catch (InterruptedException e){}
		}
		drop.put("DONE");
	}
}