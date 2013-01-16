class TreeTest{
	public static void main(String[] args){
		Tree t = new Tree();

		Node temp;
		temp = t.insert(23);
		temp = t.insert(13);
		System.out.println(temp);
		temp = t.insert(50);
		temp = t.insert(1);
		temp = t.insert(60);
		temp = t.insert(20);

		Node found = t.find(13);

		if(found != null)
			System.out.println("Found node 13");
		else
			System.out.println("Didn't find node");

		System.out.println("Inorder traversal:");
		t.inOrder(t.getRoot());

		System.out.println("Preorder traversal:");
		t.preOrder(t.getRoot());

		System.out.println("Postorder traversal:");
		t.postOrder(t.getRoot());

	//	if(t.delete(13))
	//		System.out.println("Deleted node 13");
	//	else
	//		System.out.println("There was no node 13");

	}
}