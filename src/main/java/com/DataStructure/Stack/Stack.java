package com.DataStructure.Stack;

public interface Stack<T> {
	void push(T data);
	T peek();
	T pop();
	boolean isEmpty();
}
