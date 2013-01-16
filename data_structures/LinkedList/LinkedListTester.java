class Link{
	private int data;
	private Link next;

	public Link(int d){
		data = d;
	}

	public String toString(){
		return ""+data+"";
	}

	public int getData(){
		return data;
	}

	public void setData(int d){
		data = d;
	}

	public Link getNext(){
		return next;
	}
	public void setNext(Link n){
		next = n;
	}
}

class LinkedList{
	private Link first;
	
	public LinkedList(){
		first = null;
	}

	public boolean isEmpty(){
		return (first == null);
	}

	public Link getFirst(){
		return first;
	}

	public void insertFirst(int d){
		Link newLink = new Link(d);
		newLink.setNext(first);
		first = newLink;
	}
	public Link deleteFirst(){
		Link temp = first;
		first = first.getNext();
		return temp;
	}

	public Link searchList(int d){
		if(isEmpty()) return null;

		Link current = first;
		while(current != null){
			if(current.getData() == d){
				return current;
			}
			current = current.getNext();
		}
		return null;
	}
	
	public void deleteItem(int d){
		Link item;
		Link pred;

	}


	public String toString(){
		StringBuffer output = new StringBuffer();
		output.append("List (first-->last)\n");
		Link current = first;
		while(current != null){
			output.append(current.toString() + " , ");
			current = current.getNext();
		}
		output.append("\n");
		return output.toString();
	}

}

class LinkedListTester{

	public static void main(String[] args){
		LinkedList theList = new LinkedList();

		theList.insertFirst(13);
		theList.insertFirst(22);
		theList.insertFirst(25);
		theList.insertFirst(12);

		Link test = new Link(33);
		System.out.print(test);

		System.out.print(theList);

		theList.deleteFirst();

		System.out.print(theList);

		System.out.println("Looking for 13.... Found "+theList.searchList(13));



	}
	
}
