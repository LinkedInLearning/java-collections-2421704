package com.linkedin.collections;

import java.util.HashMap;
import java.util.Map;

public class BadKeyExampleApplication {

	public static void main(String[] args) {
		
		RoomWithBadKey piccadilly = new RoomWithBadKey("Piccadilly", "Guest RoomWithBadKey", 3, 125.00);
		RoomWithBadKey westminister = new RoomWithBadKey("Westminister", "Premiere RoomWithBadKey", 4, 175.00);
		RoomWithBadKey manchester = new RoomWithBadKey("Manchester", "Suite", 5, 225.0);

		Guest john = new Guest("John", "Doe", false);
		Guest maria = new Guest("Maria", "Doe", true);
		Guest sonia = new Guest("Sonia", "Doe", true);

		Map<RoomWithBadKey, Guest> RoomWithBadKeyAssignments = new HashMap<>();

		RoomWithBadKeyAssignments.put(piccadilly, john);
		RoomWithBadKeyAssignments.put(westminister, maria);
		RoomWithBadKeyAssignments.put(manchester, sonia);

		System.out.println(RoomWithBadKeyAssignments.get(manchester));
		System.out.println(RoomWithBadKeyAssignments.get(new RoomWithBadKey("Manchester", "Suite", 5, 225.0)));
	}
}
