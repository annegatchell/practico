public class Node{
	private Node next;
	private Integer data;

	public Node(Object d){
		data = (Integer) d;
	}

	public Node getNext(){
		return next;
	}

	public void setNext(Node n){
		next = n;
	}

	public Integer getData(){
		return data;
	}
	public void setData(Integer d){
		data = d;
	}
}