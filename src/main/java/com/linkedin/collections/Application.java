package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {

		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room manchester = new Room("Manchester", "Suite", 5, 250.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);
		Room victoria = new Room("Victoria", "Suite", 5, 225.00);

		Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge, oxford, victoria, manchester));
		oxford.setPetFriendly(true);
		victoria.setPetFriendly(true);
		
		rooms.stream()
			.filter(new Predicate<Room>() {

				@Override
				public boolean test(Room room) {
					System.out.format("Testing %s with result %b%n", room.getName(), room.isPetFriendly());
					return room.isPetFriendly();
				}
				
			}).forEach(new Consumer<Room>() {

				@Override
				public void accept(Room room) {
					System.out.println(room.getName());
				}
				
			});
		
	}
}









