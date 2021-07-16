package com.linkedin.collections;

public class Application {

	public static void main(String[] args) {

		Contract contract1 = new Implementation();
		printTerms(contract1);
	}

	private static void printTerms(Contract contract) {
		contract.term1();
		contract.term2();
	}

}
