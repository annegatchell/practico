public class Tree{
	private Node root;

	public Node getRoot(){
		return root;
	}

	public Node find(Object key){
		Node current = root;

		while(current.getData() != key){
			if(current.getData().compareTo((Integer)key) > 0){
				current = current.getLeft();
			}
			else if(current.getData().compareTo((Integer) key) < 0)
				current = current.getRight();
			if(current == null){
				return null;
			}
		}
		return current;
	}

	public Node insert(Object o){
		Node newNode = new Node(o);
		if(root == null){
			root = newNode;
			return root;
		}
		else{
			Node current = root;
			Node parent;
			while(true){
				parent = current;
				if(current.getData().compareTo((Integer) o) > 0){
					current = current.getLeft();
					if(current == null){
						parent.setLeft(newNode);
						return newNode;
					}
				} else{
					current = current.getRight();
					if(current == null){
						parent.setRight(newNode);
						return newNode;
					}
				}
			}
		}
	}

	public void inOrder(Node localRoot){
		if (localRoot != null){
			inOrder(localRoot.getLeft());
			System.out.println(localRoot);
			inOrder(localRoot.getRight());
		}

	}

	public void preOrder(Node localRoot){
		if(localRoot != null){
			System.out.println(localRoot);
			inOrder(localRoot.getLeft());
			inOrder(localRoot.getRight());
		}
	}

	public void postOrder(Node localRoot){
		if(localRoot != null){
			inOrder(localRoot.getLeft());
			inOrder(localRoot.getRight());
			System.out.println(localRoot);
		}
	}

	public boolean delete(Object o){
		return false;
	}
}