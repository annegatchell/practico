public class Drop {
	private String message;
	private boolean empty = true;

	public synchronized String take() {
		while(empty) {
			try{
				wait();
			} catch (InterruptedException e) { }
		}
		String msg = message;
		empty = true;
		notifyAll();
		return msg;
	}

	public synchronized void put(String msg) {
		while(!empty) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}

		message = msg;
		empty = false;
		notifyAll();
	}
}


// System.out.printf("Consumer %s: Took message: %s%n",
// 				Thread.currentThread().getName(), message);