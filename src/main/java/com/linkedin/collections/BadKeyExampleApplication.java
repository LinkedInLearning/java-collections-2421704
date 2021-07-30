package com.linkedin.collections;

import java.util.HashMap;
import java.util.Map;

public class BadKeyExampleApplication {

	public static void main(String[] args) {
		
		RoomWithBadKey piccadilly = new RoomWithBadKey("Piccadilly", "Guest Room", 3, 125.00);
		RoomWithBadKey oxford = new RoomWithBadKey("Oxford", "Suite", 5, 225.0);
		
		Guest john = new Guest("John", "Doe", false);
		Guest maria = new Guest("Maria", "Doe", true);

		Map<RoomWithBadKey, Guest> assignments = new HashMap<>();

		assignments.put(piccadilly, john);
		assignments.put(oxford, maria);
		
		System.out.println("Oxford: " + assignments.get(new RoomWithBadKey("Oxford", "Suite", 5, 225.0)));
		System.out.println("Piccadilly: " + assignments.get(piccadilly));
	}
}
