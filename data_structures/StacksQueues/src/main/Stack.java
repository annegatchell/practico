package src.main;

import java.lang.reflect.Array;
import java.lang.Exception;

public class Stack<T>{
	private final T[] stack;
	private int stackPointer = -1;

	public Stack(int capacity){
		stack = (T[]) new Object[capacity];
		stackPointer = -1;
	}

	public Stack(Class<T> clazz, int capacity){
		stack = (T[]) Array.newInstance(clazz, capacity);
		stackPointer = -1;
	}

	public boolean isEmpty(){
		return (stackPointer == -1);
	}

	public void push(T item) throws Exception{
		if(stackPointer == stack.length - 1){
			throw new Exception("Stack overflow");
		}
		stackPointer = (++stackPointer) % stack.length;
		stack[stackPointer] = item;
	}

	public T pop() throws Exception{
		if(stackPointer == -1){
			throw new Exception("Stack underflow");
		}
		T poppedItem = stack[stackPointer];
		stackPointer = (--stackPointer) % stack.length;
		return poppedItem;
	}

	public T peek(){
		if(stackPointer == -1){
			return null;
		}
		return stack[stackPointer];
	}
}