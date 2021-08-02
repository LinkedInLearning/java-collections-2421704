package com.linkedin.collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookingServiceTest {

	BookingService bookingService;
	Room piccadilly, cambridge, westminister, oxford, victoria, manchester;
	Guest john, maria, sonia, siri, bob, sandra;

	@BeforeEach
	void setUp() throws Exception {
		
		this.bookingService = new BookingService();
		
		piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		westminister = new Room("Westminister", "Premiere Room", 4, 200.00);
		oxford = new Room("Oxford", "Suite", 5, 225.0);
		victoria = new Room("Victoria", "Suite", 5, 225.0);
		manchester = new Room("Manchester", "Suite", 5, 250.0);
		
		john = new Guest("John", "Doe", false);
		maria = new Guest("Maria", "Doe", true);
		sonia = new Guest("Sonia", "Doe", true);
		siri = new Guest("Siri", "Doe", true);
		bob = new Guest("Bob", "Doe", false);
		sandra = new Guest("Sandra", "Doe", false);
	}

	@Test
	void testBook() {
		assertTrue(this.bookingService.book(cambridge, bob));
		assertTrue(this.bookingService.book(oxford, maria));
		assertTrue(this.bookingService.book(victoria, sonia));
		assertFalse(this.bookingService.book(cambridge, siri));
		assertFalse(this.bookingService.book(cambridge, sandra));
		assertFalse(this.bookingService.book(oxford, john));
		assertFalse(this.bookingService.book(victoria, john));
	}
	
	@Test
	void testTotalRevenue() {
		
		this.bookingService.book(piccadilly, john);
		this.bookingService.book(oxford, maria);
		this.bookingService.book(manchester, siri);
		this.bookingService.book(victoria, sonia);

		assertEquals(825, this.bookingService.totalRevenue());
		this.bookingService.book(cambridge, sandra);

		assertEquals(1000, this.bookingService.totalRevenue());
		
	}
}
