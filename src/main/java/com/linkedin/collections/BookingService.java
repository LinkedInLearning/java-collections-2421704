package com.linkedin.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingService {

	private Map<Room, Guest> bookings = new HashMap<>();

	private RoomService roomService;

	public BookingService(RoomService roomService) {
		this.roomService = roomService;
	}

	public void book(List<Guest> guests) {

		/*
		 * Basic:
		 * 
		 * Places the provided lists of guests into the bookings map as new Entry<Guest,Book>.
		 * Each guest should ONLY be assigned to one room found in the Room Manager Inventory.
		 * You can assume that guests.size =< roomManager.getInventory().size.  
		 * 
		 * Bonus:
		 * 
		 * Each guest has a List of preferred rooms. The List<Guest> is provided in
		 * the order that guests have checked in, with guests earlier in the list
		 * receiving priority in their room choice.  Optimize the associations placed into
		 * the map so that guests receive their highest available preferred room.
		 *  
		 */

	}

	public Map<Room, Guest> getBookings() {
		return bookings;
	}
}
