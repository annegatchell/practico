public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHasMapTest tester = new LinkedHashMapTest();
		tester.runTests(true);
	}
	private class TestStatus{
		private boolean pass;
		private String message;
		TestStatus(boolean pass){
			this.pass = pass;
			this. message = message;
		}
	}

	public boolean runTests(boolean verbose) {

	}

	public boolean testPutGet(){
		OrderedHashMap<Integer, String> linkedHashMap = 
				new OrderedHashMap<Integer, String>();
		ArrayList<TestStatus> status= new ArrayList<TestStatus>();
		if(linkedHashMap.get(4) != null){
			status.add(new TestStatus(false, "Empty hash needs to return null") );
		}
		linkedHashMap.put(42, "forty-two");
		linkedHashMap.put(33, "forty-two");
		linkedHashMap.put(34, "forty-two");
		if(linkedHashMap.get(42) != "forty-two"){
			status.add(new TestStatus(false, "Incorrect value"));
		}
	}



	//Ordered key function
	public static void outputKeys(HashMap hashMap) {
        for(K key : hashMap.keySet()){
            System.out.println(key);
        }
    }   

}