package com.generation.entity;

public class Pugile extends Persona {

	private int peso;

	public Pugile(String nominativo, int eta, int peso) {
		super(nominativo, eta);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Pugile [Nome Cognome: " + getNominativo() + ", Eta=" + getEta() + ", Peso: " + peso + "]";
	}

	
	
	
	
}
