package com.linkedin.collections;

import java.util.HashMap;
import java.util.Map;

public class BookingService {

	private Map<Room, Guest> bookings = new HashMap<>();

	public boolean book(Room room, Guest guest) {

		/*
		 * 1. The provided Guest is placed in the bookings Map and
		 * associated with the provided room, only if no other guest
		 * is associated with the room.
		 * 
		 * Returns a boolean that indicates if the Guest was
		 * successfully placed in the room.
		 */
		
		return this.bookings.putIfAbsent(room, guest) == null;
	}

	public double totalRevenue() {
		
		/*
		 * 2. Returns a double that totals the rate of each Room booked
		 * in the bookings Map.
		 */
		return this.bookings.keySet().stream()
				.mapToDouble(Room::getRate)
				.sum();
	}
	
	public Map<Room, Guest> getBookings() {
		return bookings;
	}
}



