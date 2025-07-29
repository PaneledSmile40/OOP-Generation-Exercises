package com.generation.exercises.ex03;

public class PersonaleAmministrativo extends Staff {
	private String settoreUfficio;
	
	public PersonaleAmministrativo() {}
	public PersonaleAmministrativo(String nome, String cognome, int eta, String residenza, int anniDiLavoro, String settoreUfficio) {
		super(nome,cognome,eta,residenza,anniDiLavoro);
		setSettoreUfficio(settoreUfficio);
	}

	@Override
	public String toString() {
		return "Personale Amministrativo\n" + super.toString() + ",\nSettore ufficio: " + getSettoreUfficio();
	}
	
	
	public String getSettoreUfficio() {
		return settoreUfficio;
	}

	public void setSettoreUfficio(String settoreUfficio) {
		this.settoreUfficio = settoreUfficio;
	}
	

}
