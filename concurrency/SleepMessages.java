public class SleepMessages {
	public static void main(String[] args) 
		throws InterruptedException {
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
			Thread.sleep(2000);
			//Print out message
			System.out.println(importantInfo[i]);
		}
	}
}