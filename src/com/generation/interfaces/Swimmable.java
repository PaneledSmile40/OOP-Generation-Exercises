package com.generation.interfaces;

public interface Swimmable {
	int MAX_DEPTH = 1000;
	
	default void swim(int m) {
		System.out.println("Nuoto per " + m + " m nel tipo di acqua " +  waterType());
	}
	
	abstract String waterType(); //dolce o salata
}
