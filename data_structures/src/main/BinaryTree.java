package src.main;

public class BinaryTree <K extends Comparable<K>, V>{
	
	private Node root;

	private class Node{
		private K key;
		private V value;
		private Node right, left;
		private int numNodes; //number nodes in subtree rooted here

		Node(K k, V val, int n){
			key = k;
			value = val;
			numNodes = n;
		}
	}

	public void put(K key, V val){
		root = put(root, key, val);
	}

	private Node put(Node x, K key, V val){
		if(x == null) return new Node(key, val, 1);
		int compareResult = key.compareTo(x.key);
		if(compareResult < 0){
			x.left = put(x.left, key, val);
		} else if(compareResult > 0){
			x.right = put(x.right, key, val);
		} else{
			x.value = val;
		}
		x.numNodes = 1 + size(x.left) + size(x.right);
		return x;
	}

	public V get(K key){
		Node x = root;
		while(x != null){
			int compareResult = key.compareTo(x.key);
			if(compareResult < 0) x = x.left;
			else if(compareResult > 0) x = x.right;
			else return x.value;
		}
		return null;
	}

	public V min(){
		Node x = root;
		if(x == null) return null;
		while(x.left != null){
			x = x.left;
		}
		return x.value;
	}

	public V max(){
		Node x = root;
		if(x == null) return null;
		while(x.right != null){
			x = x.right;
		}
		return x.value;
	}

	public int size(){
		return size(root);
	}

	private int size(Node x){
		if(x == null) return 0;
		return x.numNodes;
	}

	// public V floor(K key){
		
	// }

	public void delete(K key){

	}

	// public Iterable<K> iterator(){

	// }

}