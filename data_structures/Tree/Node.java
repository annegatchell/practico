public class Node{
	Integer data;
	Node left;
	Node right;
	Node parent;

	public Node(Object o){
		data = (Integer) o;
	}

	public String toString(){
		return data.toString();
	}

	public Integer getData(){
		return data;
	}
	public void setData(Object o){
		data = (Integer) o;
	}
	public Node getLeft(){
		return left;
	}
	public void setLeft(Node n){
		left = n;
	}
	public Node getRight(){
		return right;
	}
	public void setRight(Node n){
		right = n;
	}
	public Node getParent(){
		return parent;
	}
	public void setParent(Node p){
		parent = p;
	}
}