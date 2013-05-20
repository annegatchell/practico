class ControlFlow {
	public static void main(String[] args) {
		test(3);
	}

	public static void test(int aNumber){
		if (aNumber >= 0)
		    if (aNumber == 0)
		        System.out.println("first string");
		else System.out.println("second string");
		System.out.println("third string");
	}
}