package com.generation.entity;

public class Tennista extends Persona {
	private String sponsor;
	private String lateralita;
	public Tennista(String nominativo, int eta, String sponsor, String lateralita) { 
		super(nominativo, eta);
		this.sponsor = sponsor;
		this.lateralita = lateralita;
	}
	
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	public String getLateralita() {
		return lateralita;
	}
	public void setLateralita(String lateralita) {
		this.lateralita = lateralita;
	}
	@Override
	public String toString() {
		return "Tennista [Nome Cognome: " + getNominativo() + ", Eta: " + getEta() + ", Sponsor: " + sponsor
				+ ", Lateralita: " + lateralita + "]";
	}
	
	
}
