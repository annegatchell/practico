import java.util.*;

public class cci_2_1{
	
	//This method of hashing on the Node itself is bad, since
	//The node objects are different from each other
	/*public static void removeDuplicates(Node head){
		Set<Node> seenElements = new HashSet<Node>();
		seenElements.add(head);
		Node current = head.next;
		Node prev = head;
		while(current != null){
			System.out.println(seenElements);
			if(seenElements.contains(current)){
				prev.next = current.next;
				current = prev.next;
			} else {
				seenElements.add(current);
			}
			prev = prev.next;
			current = current.next;
		}
	}*/

	public static void removeDuplicatesHashSet(Node n){
		Set<Integer> seenElements = new HashSet<Integer>();
		Node prev = null;
		while(n != null){
			if(seenElements.contains(n.data)){
				prev.next = n.next;
			} else {
				seenElements.add(n.data);
				prev = n;
			}
			n = n.next;
		}
	}


// This didn't get to the end of the list
	/*public static void removeDuplicatesNoBuffer(Node head){
		Node current = head;
		Node runner, runnerprev;
		while(current != null){
			runner = current.next;
			runnerprev = current;
			while(runner != null){
				if(runner.data == current.data){
				//Delete runner node
					runnerprev.next = runner.next;
					runner = runner.next;
				}//advance runner
				runner = runner.next;
				runnerprev = runnerprev.next;
			}
			//Advance current
			current = current.next;
		}
	}*/

	public static void removeDuplicatesNoBuffer(Node head){
		Node current = head;
		Node runner;
		while(current != null){
			runner = current;
			while(runner.next != null){
				if(runner.next.data == current.data){
				//Delete runner node
					runner.next = runner.next.next;
				}else{
					runner = runner.next;
				}
			}
			//Advance current
			current = current.next;
		}
	}


	public static void printLinkedList(Node head){
		Node current = head;
		while(current.next != null){
			System.out.print(current.toString()+"->");
			current = current.next;
		}
		System.out.println(current.toString()+"\n");
	}


	public static void main(String[] args){
		Node test1 = new Node(1);
		test1 = Node.add(test1, 1);
		test1 = Node.add(test1, 2);
		test1 = Node.add(test1, 1);
		test1 = Node.add(test1, 2);
		test1 = Node.add(test1, 3);

		printLinkedList(test1);
		removeDuplicatesHashSet(test1);
		printLinkedList(test1);

		test1 = new Node(1);
		test1 = Node.add(test1, 1);
		test1 = Node.add(test1, 2);
		test1 = Node.add(test1, 1);
		test1 = Node.add(test1, 2);
		test1 = Node.add(test1, 3);

		printLinkedList(test1);
		removeDuplicatesNoBuffer(test1);
		printLinkedList(test1);
	}

}