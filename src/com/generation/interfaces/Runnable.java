package com.generation.interfaces;

public interface Runnable {
	static double energyNeeded(int km) {
		return km*1.5;
	}
	
	default void run(int km) {
		System.out.println("Sto correndo " + km + " km (energia= " + energyNeeded(km)*getLegs() + ")");
	}
	
	abstract int getLegs();
}
