package src.main;
import java.util.Arrays;

public class Sorter{

	public static void main(String args[]){

	}

	public static <T extends Comparable<T>> void insertionSort(T[] input){
		T key;
		for(int j = 1; j < input.length; j++){
			key = input[j];
			int i = j-1;
			while(i >= 0 && key.compareTo(input[i]) < 0){
				input[i+1] = input[i];
				i--;
			}
			input[i+1] = key;
		}	
	}

	public static <T extends Comparable<T>> void mergeSort(T[] input, int lowIndex, int upperIndex){
		if(lowIndex < upperIndex){
			int midpoint = (upperIndex + lowIndex)/2;
			mergeSort(input, lowIndex, midpoint);
			mergeSort(input, midpoint+1, upperIndex);
			merge(input, lowIndex, midpoint, upperIndex);
		}
	}

	public static <T extends Comparable<T>> void merge(T[] input, int lowIndex, int midpoint, int upperIndex){
		int lengthLowerHalf = midpoint - lowIndex + 1;
		int lengthUpperHalf = upperIndex - midpoint;
		T[] lowerHalfCopy = Arrays.copyOfRange(input, lowIndex, midpoint+1);
		T[] upperHalfCopy = Arrays.copyOfRange(input, midpoint+1, upperIndex+1);
		int lowerIterator = 0;
		int upperIterator = 0;
		for(int i = lowIndex; i<=upperIndex; i++){
			if(lowerIterator >= lengthLowerHalf){
				input[i] = upperHalfCopy[upperIterator];
				upperIterator++;
			} else if (upperIterator >= lengthUpperHalf){
				input[i] = lowerHalfCopy[lowerIterator];
				lowerIterator++;
			} else if(lowerHalfCopy[lowerIterator].compareTo(upperHalfCopy[upperIterator]) < 0){
				input[i] = lowerHalfCopy[lowerIterator];
				lowerIterator++;
			} else if(lowerHalfCopy[lowerIterator].compareTo(upperHalfCopy[upperIterator]) > 0){
				input[i] = upperHalfCopy[upperIterator];
				upperIterator++;
			}
		}
	}

	
}