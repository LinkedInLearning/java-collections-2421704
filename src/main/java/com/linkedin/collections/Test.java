package com.linkedin.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

	public static void main(String[] args) {
		Deque arrayDeque = new ArrayDeque();
		
		arrayDeque.push("E");
		arrayDeque.push("D");
		arrayDeque.push("C");
		arrayDeque.push("B");
		arrayDeque.push("A");
		
		System.out.println(arrayDeque.removeFirst());
		
		for (int i = 0; i < arrayDeque.size(); i++) {
			System.out.println(String.valueOf(i) + arrayDeque.removeFirst());
		}
	}
}
