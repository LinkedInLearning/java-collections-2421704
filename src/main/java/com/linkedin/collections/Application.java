package com.linkedin.collections;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(500, 1500, 2500, 1000, 3000, 2000);
		
		NavigableSet<Integer> numberTree = new TreeSet<>(numbers);
		
		numberTree.headSet(1750).stream()
		.forEach(System.out::println);
			
		numberTree.tailSet(1750).stream()
		.forEach(System.out::println);

		numberTree.subSet(1750, 2750).stream()
			.forEach(System.out::println);

		System.out.println(numberTree.lower(1750));

		System.out.println(numberTree.higher(1750));
		
	}
}
