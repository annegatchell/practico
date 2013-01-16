public class Stack{
	Node top;

	Object pop(){
		if(top != null){
			Object item = top.getData();
			top = top.getNext();
			return item;
		}
		return null;
	}

	void push(Object o){
		Node n = new Node(o);
		n.setNext(top);
		top = n;
	}

	Object peek(){
		return top.getData();
	}
}
