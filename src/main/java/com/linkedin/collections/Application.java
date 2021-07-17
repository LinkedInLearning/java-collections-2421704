package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Application {

	public static void main(String[] args) {
		
		Collection<Room> c = new ArrayList<>(); //Same Collection Type, Different Element Type
		c.add(new Room("Cambridge", "Suite", 6, 250.0));
		
		c.stream()
			.forEach(e -> System.out.println(((Room)e).getType()));
		
	}

}
