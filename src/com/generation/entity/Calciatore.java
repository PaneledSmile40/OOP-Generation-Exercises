package com.generation.entity;

public class Calciatore extends Persona {

	private int numeroMaglia;
	private String ruolo;
	private String squadra;
	
	public Calciatore(String nominativo, int eta, int numeroMaglia, String ruolo, String squadra) {
		super(nominativo, eta);
		this.numeroMaglia = numeroMaglia;
		this.ruolo = ruolo;
		this.squadra = squadra;
	}
	
	public int getNumeroMaglia() {
		return numeroMaglia;
	}
	public void setNumeroMaglia(int numeroMaglia) {
		this.numeroMaglia = numeroMaglia;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public String getSquadra() {
		return squadra;
	}
	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}
	
	@Override
	public String toString() {
		return "Calciatore [Nome Cognome: " + getNominativo() + ", Eta: " + getEta() + ", Numero maglia: "
				+ numeroMaglia + ", Ruolo: " + ruolo + ", Squadra: " + squadra + "]";
	}
	
	

}
