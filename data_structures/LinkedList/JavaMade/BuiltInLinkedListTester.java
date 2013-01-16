import java.util.*;

class BuiltInLinkedListTester{
	
	LinkedList<Barrett> lst = new LinkedList<Barrett>();

	class NameCompare implements Comparator<Barrett>{
		public int compare(Barrett one, Barrett two){
			return one.getName().compareTo(two.getName());
		}
	}

	class NumKidsCompare implements Comparator<Barrett>{
		public int compare(Barrett one, Barrett two){
			return (two.getNumKids() - one.getNumKids());
		}
	}
	public void go(){
		lst.add(new Barrett("Anne", 0));
		lst.add(new Barrett("Mary", 2));
		lst.add(new Barrett("Bill", 7));

		System.out.println("as entered:\n" + lst);

		NameCompare nc = new NameCompare();
		Collections.sort(lst, nc);
		System.out.println("by name:\n" + lst);

		NumKidsCompare nkc = new NumKidsCompare();
		Collections.sort(lst, nkc);
		System.out.println("by kids:\n" + lst);
	}
	
	public static void main(String[] args){
		new BuiltInLinkedListTester().go();
		//BuiltInLinkedListTester t = new BuiltInLinkedListTester();
		//t.go();
	}

	
}

class Barrett{
	private String name;
	private int numKids;

	public Barrett(String n, int i){
		name = n;
		numKids = i;
	}

	public String toString(){
		return "Name: " + name + ", Number of Kids: "+ numKids;
	}

	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	public int getNumKids(){
		return numKids;
	}
	public void setNumKids(int n){
		numKids = n;
	}
}