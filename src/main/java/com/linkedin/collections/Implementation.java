package com.linkedin.collections;

public class Implementation implements Contract  {

	@Override
	public void term1() {
		System.out.println("Implementation:term1");
	}

	@Override
	public void term2() {
		System.out.println("Implementation:term2");
	}

	@Override
	public void extendedTerm() {
		System.out.println("Implementation:extended");
	}

	
}
