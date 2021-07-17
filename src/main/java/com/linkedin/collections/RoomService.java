package com.linkedin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class RoomService {

	// 1. Add Collection to store Room Inventory
	private Collection<Room> inventory;

	public RoomService() {

		// 2. Initialize Collection
		this.inventory = new HashSet<>();
	}

	public Collection<Room> getInventory() {

		// 3. Return Room Inventory
		return new HashSet<>(this.inventory); 
	}

	public void createRoom(String name, String type, int capacity, double price) {

		// 3. Add a new Room to Room Inventory
		this.inventory.add(new Room(name, type, capacity, price));
	}

	public void createRooms(Room[] rooms) {

		// 4. Add Multiple Rooms to Room Inventory
		this.inventory.addAll(Arrays.asList(rooms));
	}

	public void removeRoom(Room room) {

		// 5. Remove Room From Room Inventory
		this.inventory.remove(room);
	}

}
