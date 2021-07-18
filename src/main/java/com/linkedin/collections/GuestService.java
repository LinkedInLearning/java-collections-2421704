package com.linkedin.collections;

import java.util.ArrayList;
import java.util.List;

public class GuestService {

	private List<Guest> checkInList = new ArrayList<>(100);

	public static List<Guest> filterByFavoriteRoom(List<Guest> guests, Room room) {

		// 1. Returns a new collection that contains guests from the provided collection 
		// who have indicated the provided room is their first preference
		
		return null; 

	}

	public void checkIn(Guest guest) {
		
		// 2. Adds a guest to the check in list, placing members of the loyalty program
		// ahead of those guests not in the program, otherwise guests are ordered in the
		// sequence they are added.
	
	}
	
	public void swapPosition(Guest guest1, Guest guest2) {
		
		// 3.  Swaps the position of the two provided guests within the check-in list.
		// If guests are not currently in the list no action is required. 

	}

	public List<Guest> getCheckInList() {
		return List.copyOf(this.checkInList);
	}
}
