package com.linkedin.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application {

	public static void main(String[] args) {

		Guest john = new Guest("John", "Doe", false);
		Guest maria = new Guest("Maria", "Doe", false);
		Guest sonia = new Guest("Sonia", "Doe", true);
		Guest siri = new Guest("Siri", "Doe", true);

		Queue<Guest> checkinQueue = new PriorityQueue<>(Comparator.comparing(Guest::isLoyaltyProgramMember).reversed());
		
		checkinQueue.add(john);
		checkinQueue.add(maria);
		checkinQueue.add(sonia);
		checkinQueue.add(siri);

		Guest guest = checkinQueue.remove();
		System.out.println(guest);
		
		Guest guest1 = checkinQueue.element();
		System.out.println(guest1);

		print(checkinQueue);
		
	}

	public static void print(Queue<Guest> queue) {

		System.out.println(System.lineSeparator() + "--Queue Contents--");

		int x = 0;
		for(Guest guest : queue) {
			System.out.format("%x: %s %s %n", x++, guest.toString(), x == 1 ? "(Head)":"");
		}
		
	}
}
