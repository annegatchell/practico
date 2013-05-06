public class SleepMessages{
	public static void main(String[] args)
		throws InterruptedException{
		String importantInfo[] = {
			"Mare eats oats",
			"Does eat oats",
			"Little lamb eats ivy",
			"A kid will eat ivy too"
		};

		for(int i = 0;
			i < importantInfo.length;
			i++){
		//Pause for 4 seconds
			Thread.sleep(1000);
		//Print
			System.out.println(importantInfo[i]);
		}
	}

}