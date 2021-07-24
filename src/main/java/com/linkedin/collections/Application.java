package com.linkedin.collections;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		
		Collection<String> c = new ArrayDeque<>();
		c.add("snowboard");
		c.add("linux");
		c.add("books");
		c.add("snowboard");
		
		Collection<String> favoriteThings = new HashSet<>(c);
		System.out.println(favoriteThings);
		
		
	}

}
