package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Application {

	public static void main(String[] args) {
		
		Collection<Room> c = new ArrayList<>(); //Same Collection Type, Different Element Type
//		c.add("Cambridge");
//		c.add(1L);
		c.add(new Room("Cambridge", "Suite", 6, 250.0));
		
		c.stream()
			.forEach(e -> System.out.println(e.getName()));
		
		Collection c2 = new ArrayList(); //Same Collection Type, Different Element Type
		c2.add(new Room("Cambridge", "Suite", 6, 250.0));
		
	}

}
