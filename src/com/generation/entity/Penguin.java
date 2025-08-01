package com.generation.entity;

import java.time.LocalDate;

import com.generation.interfaces.Swimmable;
import com.generation.interfaces.Runnable;

public class Penguin extends Animal implements Swimmable,Runnable {

	public Penguin(String nome, LocalDate dob) {
		super(nome, dob);
	}
	
	@Override
	String speak() {
		// TODO Auto-generated method stub
		return "craaaaa";
	}


	@Override
	public int getLegs() {
		return 2;
	}


	@Override
	public String waterType() {
		return "salata";
	}
	
}
