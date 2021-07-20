package com.linkedin.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookingService {

	private Map<Room, Guest> bookings = new HashMap<>();

	private RoomService roomService;

	public BookingService(RoomService roomService) {
		this.roomService = roomService;
	}

	public void book(List<Guest> guests) {

		List<Room> availableRooms = this.roomService.getInventory().stream()
				.filter(r -> !bookings.containsKey(r))
				.collect(Collectors.toList());

		List<Room> preferredRooms = guests.stream()
				.flatMap(g -> g.getPreferredRooms().stream())
				.collect(Collectors.toList());

		availableRooms.sort(Comparator.comparingInt(r -> preferredRooms.indexOf(r)));

		for (Guest guest : guests) {

			boolean booked = false;

			for (Room room : guest.getPreferredRooms()) {

				if (this.roomService.hasRoom(room)) {

					if (bookings.putIfAbsent(room, guest) == null) {
						booked = true;
						availableRooms.remove(room);
						break;
					}

				}

			}

			if (!booked) {

				this.bookings.putIfAbsent(availableRooms.remove(0), guest);

			}

		}

	}

	public Map<Room, Guest> getBookings() {
		return bookings;
	}
}
