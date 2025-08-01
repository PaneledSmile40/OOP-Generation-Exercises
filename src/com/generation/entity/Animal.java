package com.generation.entity;

import java.time.LocalDate;

public abstract class Animal extends LivingBeing {

	public Animal(String nome, LocalDate dob) {
		super(nome, dob);
	}
	
	abstract String speak();

}
