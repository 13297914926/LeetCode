package com.DataStructure.Stack;

import java.io.Serializable;
import java.util.EmptyStackException;

public class SeqStack<T> implements Stack<T>, Serializable {

	public int top = -1;
	public int capacity = 10;
	public T[] array;

	
	public SeqStack(int capacity) {
		array = (T[]) new Object[capacity];
	}
	public boolean isEmpty(){
		return top == -1;
	}
	
	public T peek() {
		if(isEmpty()) new EmptyStackException();
		return array[top];
	}
	public void push(T data) {
		if(top == array.length){
			ensureCapacity(2*top+1);
		}
		top++;
		array[top] = data;

	}
	public T pop() {
		if(isEmpty()) new EmptyStackException();
		return array[top--];
	}
	
	public void ensureCapacity(int capacity){
		T[] arrayOld = array;
		array = (T[])new Object[capacity];
		for (int i = 0; i < arrayOld.length; i++) {
			array[i] = arrayOld[i];
		}
	}
}
