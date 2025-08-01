package com.generation.entity;

import java.time.LocalDate;

public abstract class Mammal extends Animal {

	protected double temperaturaCorporea;

	public Mammal(String nome, LocalDate dob, double temperaturaCorporea) {
		super(nome, dob);
		this.temperaturaCorporea = temperaturaCorporea;
	}

	public double getTemperaturaCorporea() {
		return temperaturaCorporea;
	}

	public void setTemperaturaCorporea(double temperaturaCorporea) {
		this.temperaturaCorporea = temperaturaCorporea;
	}

}
