package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Application {

	public static void main(String[] args) {
		
		Collection c = new ArrayList(); //Same Collection Type, Different Element Type
		c.add("Cambridge");
		
		Collection c2 = new ArrayList(); //Same Collection Type, Different Element Type
		c2.add(new Room("Cambridge", "Suite", 6, 250.0));
		
	}

}
