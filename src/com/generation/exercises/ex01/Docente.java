package com.generation.exercises.ex01;

public class Docente {
	private String nome,cognome;
	private int eta;
	private int oreMensili;
	private double pagaOraria;
	private boolean ordinario;
	
	public Docente() {};
	public Docente(String nome,String cognome,int eta,int oreMensili,double pagaOraria,boolean ordinario) {
		this.nome = nome;
		this.cognome=cognome;
		this.eta=eta;
		this.oreMensili=oreMensili;
		this.pagaOraria=pagaOraria;
		this.ordinario=ordinario;
	}
	
	public String toString() {
		return ("Scheda Docente\n" + getNome()+" "+getCognome() + "\nEtà "+getEta() + "\nStipendio Mensile " + showSalary() + (isOrdinario() ? "\nDocente Ordinario":"\nDocente non Ordinario")  );
	}
	
	public double showSalary() {
		return getPagaOraria() * getOreMensili();
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
	public boolean isOrdinario() {
		return ordinario;
	}
	public void setOrdinario(boolean ordinario) {
		this.ordinario = ordinario;
	}
	
	
	
}
