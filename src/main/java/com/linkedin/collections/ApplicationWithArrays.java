package com.linkedin.collections;

import java.util.Arrays;

public class ApplicationWithArrays {

	public static void main(String[] args) {

		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room manchester = new Room("Manchester", "Suite", 5, 250.0);
		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);

		Room[] rooms = null;
				
		
		
		
		getPotentialRevenue(rooms);
	}

	private static double getPotentialRevenue(Room[] rooms) {
		return Arrays.stream(rooms)
				.mapToDouble(r -> r.getRate())
				.sum();
	}

}
