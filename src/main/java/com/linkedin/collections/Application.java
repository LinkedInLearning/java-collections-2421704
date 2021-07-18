package com.linkedin.collections;

import java.util.HashSet;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room manchester = new Room("Manchester", "Suite", 5, 250.00);
		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);
		Room victoria = new Room("Victoria", "Suite", 5, 225.00);
		Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);
		
		Room oxfordDuplicate = new Room("Oxford", "Suite", 5, 225.0);
		
		Set<Room> otherRooms = Set.of(piccadilly, victoria);
//		otherRooms.add(manchester);
		
		Set<Room> rooms = new HashSet<>();
		rooms.add(piccadilly);
		rooms.add(oxford);
		rooms.add(oxford);
		rooms.add(oxfordDuplicate);
		
		Set<Room> moreRooms = Set.copyOf(rooms);
//		moreRooms.add(manchester);
		
		System.out.println(rooms);
	}
}
