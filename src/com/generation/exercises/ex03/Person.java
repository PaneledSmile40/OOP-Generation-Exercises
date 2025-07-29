package com.generation.exercises.ex03;

public class Person {
	private String nome,cognome,residenza;
	private int eta;
	
	public Person(){}
	public Person(String nome, String cognome, int eta, String residenza) {	
		setNome(nome);
		setCognome(cognome);
		setEta(eta);
		setResidenza(residenza);
	}
	
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + ",\nCognome: " + getCognome() + ",\nEtà: " + getEta() + ",\nCittà di residenza: " + getResidenza();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome==null?"UNKNOWN":nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome==null?"UNKNOWN":cognome;
	}
	public String getResidenza() {
		return residenza;
	}
	public void setResidenza(String residenza) {
		this.residenza = residenza==null?"UNKNOWN":residenza;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta<=0?null:eta;
	}
	
	
	
}
