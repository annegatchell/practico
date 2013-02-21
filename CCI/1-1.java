import java.util.*;

class UniqueCharStringTester{

	public boolean stringHasAllUniqueChars_SET(String input){
		if(input.length() == 0)return true;
		Set<Character> seenChars = new HashSet<>();
		char[] inputChars = input.toCharArray();
		for(Character c : inputChars){
			if(seenChars.contains(c)) return false;
			seenChars.add(c);
		}
		return true;
	}

	public boolean stringHasAllUniqueChars_CHAR_ARRAY(String input){
		int numCharsInAlpha = 256;
		if(input.length() > numCharsInAlpha) return false;
		boolean[] charSet = new boolean[numCharsInAlpha];
		for(int i = 0; i < input.length(); i++){
			int val = input.charAt(i);
			if(charSet[val]) return false;
			charSet[val] = true;
		}
		return true;
	}

	public boolean stringHasAllUniqueChars_NO_DATA_STRUCTS(String input){
		if(input.length() > 26) return false;
		int charBitVector = 0;
		for(int i = 0; i < input.length(); i++){
			int val = input.charAt(i) - 'a';
			int test = 1 << val;
			if((charBitVector & test) > 0) return false;
			charBitVector |= test;
		}
		return true;
	}

	public void passed(){
		System.out.print("PASSED\n");
	}
	public void failed(){
		System.out.print("FAILED\n");
	}

	public static void main(String[] args){
		UniqueCharStringTester t = new UniqueCharStringTester();

		String empty = "";
		String allAZ = "abcdefghijklmnopqrstuvwxyz";
		String allAZLongDupes = "abcdefghijklmnopqrstuvwxyzabcdefg";
		String allAZShortDupes = "abcabcadez";
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 256; i++){
			sb.append(Character.toString((char) i));
		}
		String allASCII = sb.toString();
		sb.append("abdkejsjll");
		String allASCIILongDupes = sb.toString();
		sb = new StringBuilder();
		for(int i = 31; i < 176; i++){
			sb.append(Character.toString((char) i));
		}
		for(int i = 32; i <80; i++){
			sb.append(Character.toString((char) i));
		}
		String aSCIIdupes = sb.toString();

		System.out.println("SET:");
		System.out.println("String: "+empty +" ");
		if(t.stringHasAllUniqueChars_SET(empty)){t.passed();}
		else{t.failed();}
		System.out.println("String: "+allAZ+" ");
		if(t.stringHasAllUniqueChars_SET(allAZ)){t.passed();}
		else{t.failed();}
		System.out.println("String: "+allAZLongDupes+" ");
		if(t.stringHasAllUniqueChars_SET(allAZLongDupes)){t.failed();}
		else{t.passed();}
		System.out.println("String: "+allAZShortDupes+" ");
		if(t.stringHasAllUniqueChars_SET(allAZShortDupes)){t.failed();}
		else{t.passed();}
		System.out.println("String: "+allASCII+" ");
		if(t.stringHasAllUniqueChars_SET(allASCII)){t.passed();}
		else{t.failed();}
		System.out.println("String: "+aSCIIdupes+" ");
		if(t.stringHasAllUniqueChars_SET(aSCIIdupes)){t.failed();}
		else{t.passed();}
					
		System.out.println("CHAR ARRAY");
		System.out.println("String: "+empty+" ");
		if(t.stringHasAllUniqueChars_CHAR_ARRAY(empty)){t.passed();}
		else{t.failed();}
		System.out.println("String: "+allAZ+" ");
		if(t.stringHasAllUniqueChars_CHAR_ARRAY(allAZ)){t.passed();}
		else{t.failed();}
		System.out.println("String: "+allAZLongDupes+" ");
		if(t.stringHasAllUniqueChars_CHAR_ARRAY(allAZLongDupes)){t.failed();}
		else{t.passed();}
		System.out.println("String: "+allAZShortDupes+" ");
		if(t.stringHasAllUniqueChars_CHAR_ARRAY(allAZShortDupes)){t.failed();}
		else{t.passed();}
		System.out.println("String: "+allASCII+" ");
		if(t.stringHasAllUniqueChars_CHAR_ARRAY(allASCII)){t.passed();}
		else{t.failed();}
		System.out.println("String: "+aSCIIdupes+" ");
		if(t.stringHasAllUniqueChars_CHAR_ARRAY(aSCIIdupes)){t.failed();}
		else{t.passed();}

		System.out.println("NO DATA STRUCTURES");
		System.out.println("String: "+empty+" ");
		if(t.stringHasAllUniqueChars_NO_DATA_STRUCTS(empty)){t.passed();}
		else{t.failed();}
		System.out.println("String: "+allAZ+" ");
		if(t.stringHasAllUniqueChars_NO_DATA_STRUCTS(allAZ)){t.passed();}
		else{t.failed();}
		System.out.println("String: "+allAZLongDupes+" ");
		if(t.stringHasAllUniqueChars_NO_DATA_STRUCTS(allAZLongDupes)){t.failed();}
		else{t.passed();}
		System.out.println("String: "+allAZShortDupes+" ");
		if(t.stringHasAllUniqueChars_NO_DATA_STRUCTS(allAZShortDupes)){t.failed();}
		else{t.passed();}
		
	}
}