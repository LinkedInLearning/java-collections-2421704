package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);
		Room oxford1 = new Room("Oxford", "Guest Room", 5, 225.0);
		Room victoria = new Room("Victoria", "Suite", 5, 225.0);
		
		List<Room> rooms = new ArrayList<>(List.of(piccadilly, oxford1, cambridge, victoria, oxford));
		rooms.sort(Room.RATE_COMPARATOR);
		
		Room newLondon = new Room("New London", "Suite", 5, 225.0);
		int result = Collections.binarySearch(rooms, newLondon, Room.RATE_COMPARATOR);
		rooms.add(Math.abs(++result), newLondon);
		System.out.println("Result: " + result);
		
		System.out.println("Min: " + Collections.min(rooms, Room.RATE_COMPARATOR).getName());
		System.out.println("Max: " + Collections.max(rooms, Room.RATE_COMPARATOR).getName());
		
		
		
		System.out.format("%n%n--List Contents--%n");
		rooms.stream()
			.forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getRate()));
	}
	
}
