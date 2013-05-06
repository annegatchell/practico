public class Drop{
	//Message to send from producer to condumer
	private String message;
	//True if consumer should wait to consumer
	//False if producer should wait to produce
	private Boolean empty = true;

	public synchronized String take(){
		//Wait until there is something to take
		while(empty){
			try{
				wait();
			} catch (InterruptedException e){}
		}
		//Toggle status
		empty = true;
		//Notify the producer that the string has been taken
		notifyAll();
		return message;
	}

	public synchronized void put(String message){
		//Wait until the message has been received
		while(!empty){
			try{
				wait();
			} catch (InterruptedException e){}
		}
		//Toggle status
		empty = false;
		//Put message
		this.message = message;
		//Notify consumer that string has been added
		notifyAll();
	}

}