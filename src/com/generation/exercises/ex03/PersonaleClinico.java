package com.generation.exercises.ex03;

public class PersonaleClinico extends Staff{
	private double stipendioBase;
	private String reparto;

	
	public PersonaleClinico(){}
	public PersonaleClinico(String nome, String cognome, int eta, String residenza, int anniDiLavoro, double stipendioBase, String reparto){
		super(nome,cognome,eta,residenza,anniDiLavoro);
		setStipendioBase(stipendioBase);
		setReparto(reparto);
	}
	
	@Override
	public String toString() {
		return super.toString() + ",\nStipendio base: " + getStipendioBase() + ",\nReparto: " + getReparto();
	}
	
	
	public double getStipendioBase() {
		return stipendioBase;
	}
	public void setStipendioBase(double stipendioBase) {
		this.stipendioBase = stipendioBase < 0 ? null : stipendioBase;
	}
	public String getReparto() {
		return reparto;
	}
	public void setReparto(String reparto) {
		this.reparto = reparto == null ? "Reparto Sconosciusto" : reparto;
	}
	
	
}
