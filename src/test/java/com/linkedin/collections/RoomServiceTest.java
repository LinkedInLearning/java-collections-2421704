package com.linkedin.collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoomServiceTest {

	RoomService service;

	Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
	Room manchester = new Room("Manchester", "Suite", 5, 250.00);
	Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
	Room oxford = new Room("Oxford", "Suite", 5, 225.0);
	Room victoria = new Room("Victoria", "Suite", 5, 225.00);
	Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);

	@BeforeEach
	void setUp() throws Exception {

		this.service = new RoomService();

		this.service.createRoom("Piccadilly", "Guest Room", 3, 125.00);
		this.service.createRoom("Cambridge", "Premiere Room", 3, 175.00);
		this.service.createRoom("Victoria", "Suite", 5, 225.00);
		this.service.createRoom("Westminister", "Premiere Room", 4, 200.00);

	}

	@Test
	void testHasRoom() {

		assertFalse(this.service.hasRoom(this.manchester));
		assertTrue(this.service.hasRoom(this.cambridge));
	}

	@Test
	void testAsArray() {
		
		Room[] rooms = this.service.asArray();

		assertEquals(4, rooms.length);
		assertEquals(this.piccadilly, rooms[0]);
		assertEquals(this.cambridge, rooms[1]);
		assertEquals(this.victoria, rooms[2]);
		assertEquals(this.westminister, rooms[3]);

	}

	@Test
	void testGetByType() {
		
		Collection<Room> guestRooms = this.service.getByType("Premiere Room");

		assertEquals(2, guestRooms.size());
		assertTrue(guestRooms.stream()
				.allMatch(r -> r.getType().equals("Premiere Room")));
		assertEquals(4, this.service.getInventory().size());

	}

}
