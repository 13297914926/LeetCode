package com.DataStructure.Stack;

import java.io.Serializable;
import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T>, Serializable {
	private Node<T> top;
	public int size = 0;
	
	
	public void push(T data) {
		if(size==0){
			top = new Node<T>(data,null);
			System.out.println(top.data);
			size++;
			System.out.println("空："+data);
			return;
		}
		Node<T> node = new Node<T>(data,this.top);
		top = node;
		System.out.println("有："+data);
		size++;
	}

	public T peek() {
		if(isEmpty()){
			new EmptyStackException();
		}
		return top.data;
	}

	public T pop() {
		if(isEmpty()){
			new EmptyStackException();
		}
		Node<T> oldTop = top;
		top = top.next;
		return oldTop.data;
	}

	public boolean isEmpty() {
		return top==null;
	}
	public String toString(){
		StringBuffer datastring = null ;
		Node node1 = top;
		while(true){
			String datas = top.data.toString();
			datastring.append(datas).append(",");
			Node node2 = top.next;
			if(node2==null) break;
		}
		return datastring.toString();
		
	}
	
}
