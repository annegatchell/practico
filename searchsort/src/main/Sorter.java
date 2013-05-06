package src.main;
import java.util.Arrays;
import java.lang.Math;

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

	private static <T> void swap(T[] input, int x, int y){
		//Swaps elements x and y
		T temp = input[x];
		input[x] = input[y];
		input[y] = temp;
	}

	public static <T extends Comparable<T>> void selectionSort(T[] input){
		int currentMinimumInUnsortedPortion;
		for(int i = 0; i < input.length; i++){
			currentMinimumInUnsortedPortion = i;
			for(int j = i+1; j < input.length; j++){
				if(input[j].compareTo(input[currentMinimumInUnsortedPortion]) < 0){
					currentMinimumInUnsortedPortion = j;
				}
			}
			swap(input, i, currentMinimumInUnsortedPortion);
		}
	}

	public static <T extends Comparable<T>> void insertionSort2(T[] input){
		for(int i = 1; i < input.length; i++){
			for(int j = i; j > 0; j--){
				if(input[j].compareTo(input[j-1]) < 0){
					swap(input, j, j-1);
				}
				else break;
			}
		}
	}

	public static <T extends Comparable<T>> void shellSort(T[] input){
		//Using sequence 3x+1 for x starting at 1
		int shellSize = 1;
		while(shellSize < input.length/3) shellSize = shellSize*3 + 1;
		while(shellSize >=1){
			for(int i = shellSize; i < input.length; i++){
				for(int j = i; j >= shellSize; j -= shellSize){
					if(input[j].compareTo(input[j-shellSize]) < 0)
						swap(input, j, j-shellSize);	
					else
						break;
				}
			}
			shellSize = shellSize/3;
		}
		
	}

	public static <T> void shuffle(T[] input){
		//Knuth/Fisher-Yates shuffle
		for(int i = input.length - 1; i > 0; i--){
			int j = (int)Math.floor(Math.random()*(i+1));
			swap(input, i, j);
		}
	}

	public static Integer[] randomIntArray(int length){
		//Knuth/Fisher-Yates shuffle the array of 0 to length-1
		Integer[] array = new Integer[length];
		for(int i = 0; i < length; i++){
			array[i] = i;
		}
		for(int i = length-1; i > 0; i--){
			int j = (int)Math.floor(Math.random()*(i+1));
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		return array;
	}

	public static Integer[] sortedIntArray0ToN(int length){
		Integer[] array = new Integer[length];
		for(int i = 0; i < length; i++){
			array[i] = i;
		}
		return array;
	}

	public static <T extends Comparable<T>> void mergeSort2(T[] input){
		mergeSortRecursive(input, 0, input.length-1);
	}

	private static <T extends Comparable<T>> void mergeSortRecursive(T[] input, int bottom, int top){
		if(bottom < top ){
			int midpoint = (top + bottom)/2;
			mergeSortRecursive(input, bottom, midpoint);
			mergeSortRecursive(input, midpoint+1, top);
			merge2(input, bottom, midpoint, top);
		}
	}

	private static <T extends Comparable<T>> void merge2(T[] input, int bottom, int midpoint, int top){
		//Shortcut if already sorted
		if(input[midpoint].compareTo(input[midpoint+1]) < 0){return;}
		int bottomCounter = bottom;
		int topCounter = midpoint + 1;
		T[] inputCopy = Arrays.copyOf(input, input.length); //O(n)
		for(int k = bottom; k <= top; k++){
			if(bottomCounter > midpoint){input[k] = inputCopy[topCounter++];}
			else if(topCounter > top){input[k] = inputCopy[bottomCounter++];}
			else if(inputCopy[bottomCounter].compareTo(inputCopy[topCounter]) < 0){
				input[k] = inputCopy[bottomCounter++];
			}
			else{
				input[k] = inputCopy[topCounter++];
			}
		}
	}

	public static <T extends Comparable<T>> void bottomUpMergeSort(T[] input){
		//System.out.println(Arrays.toString(input));
		for(int size = 1; size < input.length; size += size){
			for(int low = 0; low < input.length-size; low += size+size){
				merge3(input, low, low + size - 1, Math.min(low + 2*size -1, input.length-1));
			}
		}
	}

	private static <T extends Comparable<T>> void merge3(T[] input, int low, int mid, int high){
		T[] auxilary = Arrays.copyOf(input, input.length);
		int lowCounter = low;
		int highCounter = mid+1;
		for(int k = low; k <= high; k++){
			if(lowCounter > mid) input[k] = auxilary[highCounter++];
			else if(highCounter > high) input[k] = auxilary[lowCounter++];
			else if(auxilary[lowCounter].compareTo(auxilary[highCounter]) > 0){
				input[k] = auxilary[highCounter++];
			} else { input[k] = auxilary[lowCounter++]; }
		}
		//System.out.println(Arrays.toString(input));
	}

	public static <T extends Comparable<T>> void quickSort(T[] input){
		Sorter.shuffle(input); //O(n)
		quickSort(input, 0, input.length - 1);
	}

	private static <T extends Comparable<T>> void quickSort(T[] input, int low, int high){
		if(low >= high) return;
		int CUTOFF = 10;
		if(high - low == CUTOFF -1){
			insertionSort(input, low, high);
			return;
		}
		int pivot = partition(input, low, high);
		quickSort(input, low, pivot-1);
		quickSort(input, pivot+1, high);
	}

	private static <T extends Comparable<T>> void insertionSort(T[] input, int low, int high){
		for(int i = low + 1; i <= high; i++){
			for(int j = i; j > 0; j--){
				if(input[j].compareTo(input[j-1]) < 0)
					swap(input, j, j-1);
				else
					break;
			}
		}
	}

	private static <T extends Comparable<T>> int partition(T[] input, int low, int high){
		int pivot = low;
		int i = low;
		int j = high+1;
		while(true){
			while(input[++i].compareTo(input[pivot]) < 0)
				if(i == high) break;
				
			while(input[--j].compareTo(input[pivot]) > 0){
				if(j == low) break;
			}

			if(i >= j) break;

			swap(input, i, j);
		}
		swap(input, pivot, j);
		return j;
	}

	public static <T extends Comparable<T>> T quickSelect(T[] input, int k){
		if(k > input.length) return null;
		Sorter.shuffle(input);
		int pivot = -1;
		int high = input.length-1;
		int low = 0;
		while(high > low){
			pivot = partition2(input, low, high);

			if(pivot > k) high = pivot-1;
			else if(pivot < k) low = pivot+1;
			else return input[k];
		}
		return input[k];
	}

	private static <T extends Comparable<T>> int partition2(T[] input, int low, int high){
		int pivot = low;
		int i = low;
		int j = high + 1;
		while(true){
			while(input[++i].compareTo(input[pivot]) < 0)
				if(i == high) break;
			while(input[--j].compareTo(input[pivot]) > 0)
				if(j == low) break;
			if(i >= j)
				break;
			swap(input, i, j);
		}
		swap(input, pivot, j);
		return j;
	}

	public static <T extends Comparable<T>> void quickSortEO(T[] input){
		Sorter.shuffle(input);
		quickSortEO(input, 0, input.length-1);
	}

	private static <T extends Comparable<T>> void quickSortEO(T[] input, int lo, int hi){
		if(hi <= lo) return;
		T pivot = input[lo];
		int lt = lo;
		int i = lo + 1;
		int gt = hi;
		while(i <= gt){
			int compare = input[i].compareTo(pivot);
			if(compare < 0) swap(input, lt++, i++);
			else if(compare > 0) swap(input, i, gt--);
			else 				i++;
		}
		//After completion: [lo, lt) < pivot, [lt, gt] = pivot, (gt, hi] > pivot
		quickSortEO(input, lo, lt-1);
		quickSortEO(input, gt+1, hi);
	}
}















