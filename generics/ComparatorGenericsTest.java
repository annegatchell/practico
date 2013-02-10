import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Dog implements Comparable<Dog>{
	String name;
	int age;
	int weight;
	int height;

	public int compareTo(Dog d){
		return weight - d.weight;
	}

	Dog(String n, int a, int w, int h){
		name = n;
		age = a;
		weight = w;
		height = h;
	}

	public String toString(){
		return name + " is " + age + " yrs old and " + weight + " lbs";
	}
}

public class ComparatorGenericsTest{
	public static void main(String[] args){
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Barfy", 2, 15, 10));
		dogs.add(new Dog("Odie", 5, 30, 15));
		dogs.add(new Dog("Tiny", 6, 8, 6));
		dogs.add(new Dog("Dummy", 7, 20, 13));


		System.out.println(dogs);
		Collections.sort(dogs);
		System.out.println(dogs);
	}
}