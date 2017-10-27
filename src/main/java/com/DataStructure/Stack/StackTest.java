package com.DataStructure.Stack;

import org.junit.Test;

public class StackTest {
	@Test
	public void sTest() {
		SeqStack<Character> stack = new SeqStack<Character>(10);
		String s = "(((5-3)*8-2)()";
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			switch (chars[i]) {
			case '(':
				stack.push(chars[i]);
				System.out.println(stack.peek());
				break;
			case ')':
				if (stack.peek() == '(') {
					stack.pop();
				}
				System.out.println(stack.toString());
				break;
			}

		}
		if (stack.top == -1)
			System.out.println("符号是对称的");
		if (stack.top != -1)
			System.out.println("符号是不对称的");
	}

	@Test
	public void test2() {
		Node<Character> top = new Node<Character>('(', null);
		System.out.println(top == null);
	}
}
