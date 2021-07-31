package com.linkedin.collections;

import java.util.Arrays;

public class ApplicationWithArrays {

	public static void main(String[] args) {

		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room manchester = new Room("Manchester", "Suite", 5, 250.0);
		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);

		Room[] rooms = new Room[3];
		rooms[0] = cambridge;
		rooms[1] = manchester;
		rooms[2] = piccadilly;
				
		Room[] moreRooms = new Room[4];
		System.arraycopy(rooms, 0, moreRooms, 0, rooms.length);
		moreRooms[moreRooms.length - 1] = oxford;
		
		
		getPotentialRevenue(rooms);
	}

	private static double getPotentialRevenue(Room[] rooms) {
		return Arrays.stream(rooms)
				.mapToDouble(r -> r.getRate())
				.sum();
	}

}
