package com.linkedin.collections;

import java.util.HashMap;
import java.util.Map;

public class BookingService {

	private Map<Room, Guest> bookings = new HashMap<>();

	public boolean book(Guest guest, Room room) {

		/*
		 * The provided Guest is placed in the bookings Map and
		 * associated with the provided room, only if no other guest
		 * is associated with the room.
		 * 
		 * Returns a boolean that indicates if the Guest was
		 * successfully placed in the room.
		 */
		
		return false;
	}

	public double totalRevenue() {
		
		/*
		 * Returns a double that totals the rate of each Room booked
		 * in the bookings Map.
		 */
		return 0;
	}
	
	public Map<Room, Guest> getBookings() {
		return bookings;
	}
}
