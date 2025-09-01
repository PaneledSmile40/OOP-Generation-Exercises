package com.generation.entity;

public class Nuotatore extends Persona {
	
	private String stilePreferito;

	public Nuotatore(String nominativo, int eta, String stilePreferito) {
		super(nominativo, eta);
		this.stilePreferito = stilePreferito;
	}

	public String getStilePreferito() {
		return stilePreferito;
	}

	public void setStilePreferito(String stilePreferito) {
		this.stilePreferito = stilePreferito;
	}

	@Override
	public String toString() {
		return "Nuotatore [Nome Cognome: " + getNominativo() + ", Eta: " + getEta() + ", Stile preferito: "
				+ stilePreferito + "]";
	}
	
}
