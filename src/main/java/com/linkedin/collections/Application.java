package com.linkedin.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application {

	public static void main(String[] args) {

		Guest john = new Guest("John", "Doe", false);
		Guest bob = new Guest("Bob", "Doe", false);
		Guest sonia = new Guest("Sonia", "Doe", true); //loyalty program
		Guest siri = new Guest("Siri", "Doe", true); //loyalty program

		Comparator<Guest> programComp
			= Comparator.comparing(Guest::isLoyaltyProgramMember).reversed();
		
		Queue<Guest> checkinQueue = new PriorityQueue<>(programComp);
		checkinQueue.add(john);
		checkinQueue.add(bob);
		checkinQueue.add(sonia);
		checkinQueue.add(siri);
		print(checkinQueue);
		
		Guest guest = checkinQueue.remove();
		print(checkinQueue);
		System.out.println(guest);

		Guest guest1 = checkinQueue.element();
		print(checkinQueue);
		System.out.println(guest1);

	}

	public static void print(Queue<Guest> queue) {

		System.out.format("%n--Queue Contents--%n");

		int x = 0;
		for(Guest guest : queue) {
			System.out.format("%x: %s %s %n", x++, guest.toString(), x == 1 ? "(Head)":"");
		}
		
		System.out.println("");
		
	}
}
