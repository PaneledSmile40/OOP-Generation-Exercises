package com.generation.interfaces;

public interface Flyable {

	static double avgWingSpan(double span1, double span2) {
		return (span1+span2) / 2;
	}

	default void fly(int m) {
		System.out.println("Volo per " + m + " m (apertura alare=" + getWingSpan() + ")");
	}

	abstract double getWingSpan();
}
