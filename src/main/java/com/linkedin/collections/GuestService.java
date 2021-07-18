package com.linkedin.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GuestService {

	private List<Guest> checkInList = new ArrayList<>(100);

	public static List<Guest> filterByFavoriteRoom(List<Guest> guests, Room room) {

		// 1. Returns a new collection that contains guests from the provided collection 
		// who have indicated the provided room is their first preference
		
		return guests.stream()
				.filter(g -> g.getPreferredRooms().indexOf(room) == 0)
				.collect(Collectors.toList());

	}

	public void checkIn(Guest guest) {
		
		// 2. Adds a guest to the check in list, placing members of the loyalty program
		// ahead of those guests not in the program, otherwise guests are ordered in the
		// sequence they are added.
		
		if (guest.isLoyaltyProgramMember() && !this.checkInList.isEmpty()) {

			int x = 0;
			for (; x < this.checkInList.size(); x++) {

				if (this.checkInList.get(x).isLoyaltyProgramMember()) {
					continue;
				}

				break;

			}

			this.checkInList.add(x, guest);

		} else {
			this.checkInList.add(guest);
		}

	}
	
	public void swapPosition(Guest guest1, Guest guest2) {
		
		// 3.  Swaps the position of the two provided guests within the check-in list.
		// If guests are not currently in the list no action is required. 
		
		int position1 = this.checkInList.indexOf(guest1);
		int position2 = this.checkInList.indexOf(guest2);
		
		if(position1 != -1 && position2 != -1) {
			
			this.checkInList.set(position1, guest2);
			this.checkInList.set(position2, guest1);
			
		} 

	}

	public List<Guest> getCheckInList() {
		return List.copyOf(this.checkInList);
	}
}
