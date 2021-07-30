package com.linkedin.collections;

import java.util.Deque;

public class Application {

	public static void main(String[] args) {
		
		
		
	}

	public static void print(Deque<String> deque) {

		System.out.format("%n--Deque Contents--%n");

		int x = 0;
		for(String msg : deque) {
			System.out.format("%x: %s %s %n", x++, msg, x == 1 ? "(Top)":"");
		}
		
		System.out.println("");
		
	}
}
