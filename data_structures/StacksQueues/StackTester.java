class StackTester{
	public static void main(String[] args){
		Stack s = new Stack();

		s.push(new Integer(13));
		s.push(new Integer(14));
		s.push(new Integer(15));
		s.push(new Integer(16));

		System.out.println(s.pop()); //16
		System.out.println(s.pop()); //15
		System.out.println(s.peek()); //14
		System.out.println(s.pop()); //14
		System.out.println(s.pop()); //13
		System.out.println(s.pop()); //null

	}
}