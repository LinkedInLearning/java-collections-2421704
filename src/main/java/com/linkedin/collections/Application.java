package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room westminister = new Room("Westminister", "Premiere Room", 4, 175.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);
		Room oxford1 = new Room("Oxford", "Guest Room", 5, 225.0);
		Room victoria = new Room("Victoria", "Suite", 5, 225.0);
		Room manchester = new Room("Manchester", "Suite", 5, 225.0);
		
		List<Room> rooms = new ArrayList<>(List.of(piccadilly, oxford1, cambridge, westminister, victoria, oxford, manchester));
		rooms.sort(Comparator.naturalOrder());

//		Collections.shuffle(rooms);
//		System.out.format("Random: %s%n", rooms.get(0).getName());
		print(rooms);

		
		System.out.format("%nSwapped%n");
		Collections.swap(rooms, 0, rooms.size()-1);
		print(rooms);

		System.out.format("%nReversed%n");
		Collections.reverse(rooms);
		print(rooms);

		System.out.format("%nRotated%n");
		Collections.rotate(rooms, 2);
		print(rooms);

	}
	
	private static void print(List<Room> rooms) {
		System.out.format("%nList Contents%n");

		rooms.stream()
				.forEach(r -> System.out.format("%-15s %-15s %f %n", r.getName(), r.getType(), r.getRate()));
	}


}
