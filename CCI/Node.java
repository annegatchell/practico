public class Node{
	int data;
	Node next = null;

	public Node(int d){
		data = d;
	}

	public static Node add(Node head, int d){
		Node n = new Node(d);
		n.next = head;
		head = n;
		return head;
	}

	public String toString(){
		return String.valueOf(data);
	}

}