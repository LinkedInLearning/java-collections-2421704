package com.linkedin.collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookingServiceTest {


	RoomService roomService;
	GuestService guestService;
	BookingService bookingService;

	Room piccadilly, cambridge, westminister, oxford, victoria, manchester;
	Guest john, maria, sonia, siri, bob, sandra;

	@BeforeEach
	void setUp() throws Exception {
		
		this.roomService = new RoomService();
		this.guestService = new GuestService();
		this.bookingService = new BookingService(this.roomService);

		piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		westminister = new Room("Westminister", "Premiere Room", 4, 175.00);
		oxford = new Room("Oxford", "Suite", 5, 225.0);
		victoria = new Room("Victoria", "Suite", 5, 225.0);
		manchester = new Room("Manchester", "Suite", 5, 225.0);
		Room[] rooms = { piccadilly, cambridge, westminister, oxford, victoria, manchester };

		this.roomService.createRooms(rooms);

		john = new Guest("John", "Doe", false);
		maria = new Guest("Maria", "Doe", true);
		sonia = new Guest("Sonia", "Doe", true);
		siri = new Guest("Siri", "Doe", true);
		bob = new Guest("Bob", "Doe", false);
		sandra = new Guest("Sandra", "Doe", false);
	
		sonia.getPreferredRooms().addAll(List.of(cambridge, oxford));
		maria.getPreferredRooms().addAll(List.of(cambridge, oxford));
		john.getPreferredRooms().addAll(List.of(oxford, cambridge, manchester));
	}

	@Test
	void testBook() {
			
		this.guestService.checkIn(bob);
		this.guestService.checkIn(maria);
		this.guestService.checkIn(sonia);
		this.guestService.checkIn(john);
		this.guestService.checkIn(siri);
		
		this.bookingService.book(this.guestService.getCheckInList());
		this.bookingService.book(List.of(sandra));
		
		Map<Room, Guest> bookings = this.bookingService.getBookings();
		assertEquals(6, bookings.size());
		assertTrue(bookings.values().containsAll(List.of(bob,maria,sonia,john,siri,sandra)));
		assertFalse(bookings.containsKey(null));
			
	}
	@Test
	void testBookBonus() {
		
		this.guestService.checkIn(bob);
		this.guestService.checkIn(maria);
		this.guestService.checkIn(sonia);
		this.guestService.checkIn(john);
		this.guestService.checkIn(siri);
		
		this.bookingService.book(this.guestService.getCheckInList());
		this.bookingService.book(List.of(sandra));
		
		Map<Room, Guest> bookings = this.bookingService.getBookings();

		assertEquals(maria, bookings.get(cambridge));
		assertEquals(sonia, bookings.get(oxford));
		assertEquals(john, bookings.get(manchester));

		assertTrue(List.of(siri, bob, sandra).contains(bookings.get(westminister)));
		assertTrue(List.of(siri, bob, sandra).contains(bookings.get(victoria)));
		assertTrue(List.of(siri, bob, sandra).contains(bookings.get(piccadilly)));
		
	}
}
