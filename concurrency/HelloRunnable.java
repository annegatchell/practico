public class HelloRunnable implements Runnable {
	public void run() {
		String[] importantInfo = {
			"For every job",
			"That must be done",
			"There is an element",
			"Of fun!"
		};
		for(int i = 0; 
			i < importantInfo.length;
			i++) {
			//Pause for 2 seconds
			try{
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				return;
			}
			//Print out message
			System.out.println(importantInfo[i]);
		}
		//System.out.println("Hello from a thread");
	}
	public static void main(String[] args){
		(new Thread(new HelloRunnable())).start();
	}
}