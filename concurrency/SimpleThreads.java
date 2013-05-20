public class SimpleThreads {
	static void threadMessage(String message) {
		String threadname = 
			Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadname, message);
	}

	private static class MessageLoop implements Runnable {
		public void run() {
			String[] importantInfo = {
				"For every job",
				"That must be done",
				"There is an element",
				"Of fun!"
			};
			try{
				for(int i = 0; 
					i < importantInfo.length;
					i++) {
					//Pause for 2 seconds
					Thread.sleep(4000);
					//Print out message
					threadMessage(importantInfo[i]);
				}
			} catch (InterruptedException e) {
				threadMessage("I wasn't done!");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		long patience = 1000 * 60 * 60;

		if(args.length > 0) {
			try {
				patience = Long.parseLong(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("Argument must be an integer");
				System.exit(1);
			}
		}

		threadMessage("Starting MessageLoop thread");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();

		threadMessage("Waiting for MessageLoop to finish");
		while(t.isAlive()){
			threadMessage("Still waiting...");
			t.join(1000);
			if(((System.currentTimeMillis() - startTime) > patience) &&
				t.isAlive()) {
				threadMessage("Tired of waiting!");
				t.interrupt();
				t.join();
			}
		}
		threadMessage("Finally!");
	}
}