class QueueTester{
	public static void main(String[] args){
		Queue q = new Queue();

		q.enqueue(13);
		q.enqueue(14);
		q.enqueue(15);
		q.enqueue(16);

		System.out.println(q.dequeue()); //13
		System.out.println(q.dequeue()); //14
		System.out.println(q.dequeue()); //15
		System.out.println(q.peek()); //16
		System.out.println(q.dequeue()); //16
		System.out.println(q.dequeue()); //null
	}
}