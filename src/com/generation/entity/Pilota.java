package com.generation.entity;

public class Pilota extends Persona {

	private String mezzo;
	private String scuderia;
	
	public Pilota(String nominativo, int eta, String mezzo, String scuderia) {
		super(nominativo, eta);
		this.mezzo = mezzo;
		this.scuderia = scuderia;
	}
	public String getMezzo() {
		return mezzo;
	}
	public void setMezzo(String mezzo) {
		this.mezzo = mezzo;
	}
	public String getScuderia() {
		return scuderia;
	}
	public void setScuderia(String scuderia) {
		this.scuderia = scuderia;
	}
	@Override
	public String toString() {
		return "Pilota [Nome Cognome: " + getNominativo() + ", Eta: " + getEta() + ", Mezzo: " + mezzo
				+ ", Scuderia: " + scuderia + "]";
	}
	
}
