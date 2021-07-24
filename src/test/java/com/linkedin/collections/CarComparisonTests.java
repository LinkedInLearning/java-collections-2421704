package com.linkedin.collections;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class CarComparisonTests {

	Collection<Car> cars;
	Car subaru, tesla, honda;

	@BeforeEach
	public void setUp(TestInfo info) throws Exception {

		System.out.format("%nPerforming %s%n", info.getTestMethod().get().getName());
		
		this.cars = new ArrayList<>();
		this.subaru = new Car("Subaru", "Impreza", 52000);
		this.tesla = new Car("Tesla", "Model S", 10000);
		this.honda = new Car("Honda", "Civic", 25000);
		
		this.cars.addAll(Arrays.asList(subaru, this.tesla, this.honda));
	}

	@AfterEach
	public void tearDown() throws Exception {
		
		System.out.format("%nResults%n");
		
		this.cars.stream()
			.map(c -> String.format("%s %s", c.getMake(), c.getModel()))
			.forEach(System.out::println);	
	}

	@Test
	public void removeTest() {

		this.cars.remove(honda);
		this.cars.remove(new Car("Subaru", "Impreza", 52000));

		assertEquals(1, this.cars.size());

	}

	@Test
	public void containsTest() {

		assertTrue(this.cars.contains(new Car("Tesla", "Model S", 10000)));
		assertTrue(this.cars.contains(honda)); 
		assertTrue(this.cars.contains(subaru));

	}

	@Test
	public void removeAllIdentityTest() {

		this.cars.removeAll(Arrays.asList(
				this.subaru, 
				this.tesla, 
				new Car("Honda", "Civic", 25000)
		));

		assertTrue(this.cars.isEmpty());

	}
}
