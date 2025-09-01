package com.generation.entity;

public abstract class Persona {
	private  String nominativo;
	private  String cognome;
	private  int eta;
	
	public Persona() {}
	public Persona(String nominativo, int eta) {
		this.nominativo = nominativo;
		this.eta = eta;
	}
	
	
	public String getNominativo() {
		return nominativo;
	}
	
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	@Override
	public String toString() {
		return "Persona [nominativo=" + cognome + ", eta=" + eta + "]";
	}
	
	
}
