public class SimpleThreads{
	//displays message and thread name
	public static void threadMessage(String message){
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, message);
	}

	private static class MessageLoop implements Runnable{
		public void run(){
			String importantInfo[] = {
				"Mare eats oats",
				"Does eat oats",
				"Little lamb eats ivy",
				"A kid will eat ivy too"
			};
			try{
				for(int i = 0; i < importantInfo.length; i++){
					Thread.sleep(2000);
					threadMessage(importantInfo[i]);
				}
			} catch(InterruptedException e){
				threadMessage("I wasn't done!");
			}
		}

	}
	
	public static void main(String[] args) 
	throws InterruptedException{
		long patience = 1000 * 60 * 60;

		if(args.length > 0){
			try{
				patience = Long.parseLong(args[0])*1000;
			} catch (NumberFormatException e){
				System.err.println("Argument must be an integer");
				System.exit(1);
			}
		}

		threadMessage("Starting MessageLoop thread");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();

		threadMessage("Waiting for message loop to finish");
		while(t.isAlive()){
			threadMessage("Still waiting...");
			t.join(1000); //wait 1 sec for MessageLoop thread to finish
			if((System.currentTimeMillis() - startTime) > patience && t.isAlive()){
				threadMessage("Tired of waiting!");
				t.interrupt();
				t.join(); //indefinite but shouldn't be long;
			}
		}
		threadMessage("Finally!");
	}
}