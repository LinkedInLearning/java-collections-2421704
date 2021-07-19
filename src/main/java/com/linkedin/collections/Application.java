package com.linkedin.collections;

import java.util.Queue;

public class Application {

	public static void main(String[] args) {

		Guest john = new Guest("John", "Doe", false);
		Guest maria = new Guest("Maria", "Doe", false);
		Guest sonia = new Guest("Sonia", "Doe", true);
		Guest siri = new Guest("Siri", "Doe", true);



	}

	public static void print(Queue<Guest> queue) {

		System.out.println(System.lineSeparator() + "--Queue Contents--");

		int x = 0;
		for(Guest guest : queue) {
			System.out.format("%x: %s %s %n", x++, guest.toString(), x == 1 ? "(Head)":"");
		}
		
	}
}
