package com.linkedin.collections;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Guest john = new Guest("John", "Doe", false);
		Guest maria = new Guest("Maria", "Doe", false);
		Guest sonia = new Guest("Sonia", "Doe", true);
		Guest siri = new Guest("Siri", "Doe", true);
		
		List<Guest> checkinList = new ArrayList<>(100);
		checkinList.add(john);
		checkinList.add(maria);
		
		print(checkinList);
		
		checkinList.add(0, sonia);
		print(checkinList);
		
		checkinList.get(2).setLoyaltyProgramMember(true);
		
		checkinList.addAll(1, List.of(maria, siri));
		print(checkinList);
		
		checkinList.remove(checkinList.size() - 1);
		print(checkinList);
		
		System.out.println(checkinList.indexOf(john));

	}

	public static void print(List<Guest> list) {

		System.out.format("%n--List Contents--%n");

		for (int x = 0; x < list.size(); x++) {
			Guest guest = list.get(x);
			System.out.format("%x: %s %n", x, guest.toString());
		}
		
	}
}




