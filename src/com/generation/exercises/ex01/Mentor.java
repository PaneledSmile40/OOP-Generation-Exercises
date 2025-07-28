package com.generation.exercises.ex01;

public class Mentor {
	
	private String nome,cognome;
	private int eta;
	private int oreMensili;
	private double pagaOraria;
	private int numClassi;
	
	public Mentor() {};
	public Mentor(String nome,String cognome,int eta,int oreMensili,double pagaOraria,int numClassi) {
		this.nome = nome;
		this.cognome=cognome;
		this.eta=eta;
		this.oreMensili=oreMensili;
		this.pagaOraria=pagaOraria;
		this.numClassi=numClassi;
	}
	
	public String toString() {
		return ("Scheda Mentor\n" + getNome()+" "+getCognome() + "\nEtà "+getEta() + "\nStipendio Mensile " + showSalary() + "\nClassi a carico " + getNumClassi()  );
	}
	
	public double showSalary() {
		return ( (getPagaOraria() * getOreMensili()) + (30 * getNumClassi()) ) ;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public int getOreMensili() {
		return oreMensili;
	}
	public void setOreMensili(int oreMensili) {
		this.oreMensili = oreMensili;
	}
	public double getPagaOraria() {
		return pagaOraria;
	}
	public void setPagaOraria(double pagaOraria) {
		this.pagaOraria = pagaOraria;
	}
	public int getNumClassi() {
		return numClassi;
	}
	public void setNumClassi(int numClassi) {
		this.numClassi = numClassi;
	}
}
