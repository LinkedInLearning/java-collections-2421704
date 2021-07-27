package com.linkedin.collections;

import java.util.List;

public class Application {

	public static void main(String[] args) {

		Guest john = new Guest("John", "Doe", false);
		Guest maria = new Guest("Maria", "Doe", false);
		Guest sonia = new Guest("Sonia", "Doe", true);
		Guest siri = new Guest("Siri", "Doe", true);


	}

	public static void print(List<Guest> list) {

		System.out.format("%n--List Contents--%n");

		for (int x = 0; x < list.size(); x++) {
			Guest guest = list.get(x);
			System.out.format("%x: %s %n", x, guest.toString());
		}
		
	}
}
