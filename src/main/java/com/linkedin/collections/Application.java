package com.linkedin.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

public class Application {

	public static void main(String[] args) {

		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room westminister = new Room("Westminister", "Premiere Room", 4, 175.00);
		Room manchester = new Room("Manchester", "Suite", 5, 225.0);

		Guest john = new Guest("John", "Doe", false);
		Guest maria = new Guest("Maria", "Doe", true);
		Guest sonia = new Guest("Sonia", "Doe", true);
		
		Map<Room, Guest> roomAssignmentMap = new HashMap<>();
		
		roomAssignmentMap.put(piccadilly, john);
		roomAssignmentMap.put(westminister, maria);
		roomAssignmentMap.put(manchester, sonia);
		
		System.out.println(roomAssignmentMap.get(manchester));
	
		Guest guest = roomAssignmentMap.remove(piccadilly);
		roomAssignmentMap.putIfAbsent(piccadilly, roomAssignmentMap.remove(westminister));
		roomAssignmentMap.putIfAbsent(westminister, guest);
		
		for(Entry<Room, Guest> entry : roomAssignmentMap.entrySet()) {
			Room r = entry.getKey();
			Guest g = entry.getValue();
			System.out.format("%s : %s %s%n", r.getName(), g.getFirstName(), g.getLastName());
		}
		
	}
	
	public static void print(Queue<Guest> queue) {

		System.out.format("%n--Queue Contents--%n");

		int x = 0;
		for(Guest guest : queue) {
			System.out.format("%x: %s %s %n", x++, guest.toString(), x == 1 ? "(Head)":"");
		}
		
		System.out.println("");
		
	}

}
