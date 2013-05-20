class InstanceOfDemo {
	public static void main(String[] args) {
		Parent obj1 = new Parent();
		Child obj2 = new Child();

		System.out.println("obj1 instanceof Parent: " 
			+ (obj1 instanceof Parent));
		System.out.println("obj1 instanceof Child: " 
			+ (obj1 instanceof Child));
		System.out.println("obj1 instanceof Interface: " 
			+ (obj1 instanceof Interface));
		System.out.println("obj2 instanceof Parent: " 
			+ (obj2 instanceof Parent));
		System.out.println("obj2 instanceof Child: " 
			+ (obj2 instanceof Child));
		System.out.println("obj2 instanceof Interface: " 
			+ (obj2 instanceof Interface));
	}

}

class Parent {}
interface Interface {}
class Child extends Parent implements Interface {}