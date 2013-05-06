public class Buffer<T>{
	T[] buffer;
	boolean empty;
	boolean full;
	int numItemsInBuffer = 0;
	final int bufferSize;

	public Buffer(int size){
		buffer = (T[]) new Object[size];
		full = false;
		empty = true;
		bufferSize = size;
	}

	public synchronized T take(){
		while(empty){
			try{
				wait();
			} catch (InterruptedException e){}
		}
		//Update size and take item
		T item = buffer[--numItemsInBuffer];
		if(numItemsInBuffer == 0) empty = true;
		full = false;
		//Tell everyone something has changed
		notifyAll();
		return item;
		
	}

	public synchronized void put(T item){
		//Wait until there is stuff in the buffer
		while(full){
			try{
				wait();
			} catch(InterruptedException e){}
		}

		//Update size and put item
		buffer[++numItemsInBuffer] = item;
		if(numItemsInBuffer == bufferSize) full = true;
		empty = false;
		//Tell everyone that something has changed
		notifyAll();
	}
}