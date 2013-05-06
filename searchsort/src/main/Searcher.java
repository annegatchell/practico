package src.main;

public class Searcher{
	public static <T extends Comparable<T>> int binarySearch(T[] input, T key){
		int lo = 0;
		int hi = input.length-1;
		while(lo <= hi){
			int mid = (hi + lo)/2;
			int compare = key.compareTo(input[mid]);
			if(compare < 0) hi = mid - 1;
			else if(compare > 0) lo = mid + 1;
			else return mid;
		}
		return -1;
	}

	public static <T extends Comparable<T>> int rangeFinder(T[] input, T key){
		
	}
}