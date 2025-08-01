package com.generation.entity;

import java.time.LocalDate;

public abstract class LivingBeing {
	
	protected String nome;
	protected LocalDate dob;
	
	public LivingBeing(String nome, LocalDate dob) {
		super();
		this.nome = nome;
		this.dob = dob;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int eta() 
	{
		return 2025 - dob.getYear();
	}
	
	public String info() 
	{
		return "nome: " + nome + "eta: " + eta();
	}
	
	
}
