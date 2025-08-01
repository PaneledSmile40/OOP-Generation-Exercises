package com.generation.entity;

import java.time.LocalDate;

public abstract class Bird extends Animal {

	public Bird(String nome, LocalDate dob) {
		super(nome, dob);
	}

	@Override
	String speak() {
		return null;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}