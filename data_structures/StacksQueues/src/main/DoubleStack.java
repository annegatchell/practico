package src.main;

public class DoubleStack<T>{
	T[] array;
	int stack1Bottom, stack2Bottom;
	int stack1Top, stack2Top;

	public DoubleStack(int capacity){
		array = (T[]) new Object[capacity];
		stack1Bottom = capacity/2;
		stack2Bottom = stack1Bottom + 1;
		stack1Top = stack2Bottom;
		stack2Top = stack1Bottom;
	}

	public static boolean isEmpty(DoubleStack s, int stackNum){
		if(stackNum == 1){
			return (stack1Top == stack2Bottom);
		} else if(stackNum == 2){
			return (stack2Top == stack1Bottom);
		} else {
			
		}
	}
}