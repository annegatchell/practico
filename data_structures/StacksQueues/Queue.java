public class Queue{
	Node first;
	Node last;

	void enqueue(Object o){
		if(first == null){
			last = new Node(o);
			first = last;
		} else {
			last.setNext(new Node(o));
			last = last.getNext();
		}
	}

	Object dequeue(){
		if(first != null){
			Object o = first.getData();
			first = first.getNext();
			return o;
		}
		return null;
	}

	Object peek(){
		return first.getData();
	}
}