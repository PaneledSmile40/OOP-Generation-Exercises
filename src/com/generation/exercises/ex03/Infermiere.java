package com.generation.exercises.ex03;

public class Infermiere extends PersonaleClinico {
	private boolean specializzato;
	private int oreDiurne;
	private int oreNotturne;
	
	
	public Infermiere() {}
	public Infermiere(String nome, String cognome, int eta, String residenza, int anniDiLavoro, double stipendioBase, String reparto, boolean specializzato, int oreDiurne, int oreNotturne) {
		super(nome,cognome,eta,residenza,anniDiLavoro,stipendioBase,reparto);
		setSpecializzato(specializzato);
		setOreDiurne(oreDiurne);
		setOreNotturne(oreNotturne);
	}
	
	
	@Override
	public String toString() {
		return "Infermiere\n" + super.toString() + (isSpecializzato()?"Specializzato":"Non specializzato") + ",\nOre diurne: " + getOreDiurne() + "\nOre notturne: " +getOreNotturne();
	}
	
	public double stipendioAnnuale(int numMensilità) {
		double stipendioAnnuale;
		stipendioAnnuale = getStipendioBase()*numMensilità;
		
		stipendioAnnuale += isSpecializzato() ? stipendioAnnuale*3/100 : 0; 
		stipendioAnnuale += getReparto().toLowerCase() == "psichiatria" ? 2000 : (getReparto().toLowerCase() == "neurologia" ? 1500:0);
		stipendioAnnuale += (getAnniDiLavoro() > 5 && getAnniDiLavoro() <= 10 ? 50 : ( getAnniDiLavoro() > 10 && getAnniDiLavoro() <= 15 ? 70 : (getAnniDiLavoro() > 15) ? 100 : 0) );
		
		
		return stipendioAnnuale;
	}
	
	
	public boolean isSpecializzato() {
		return specializzato;
	}
	public void setSpecializzato(boolean specializzato) {
		this.specializzato = specializzato;
	}
	public int getOreDiurne() {
		return oreDiurne;
	}
	public void setOreDiurne(int oreDiurne) {
		this.oreDiurne = oreDiurne;
	}
	public int getOreNotturne() {
		return oreNotturne;
	}
	public void setOreNotturne(int oreNotturne) {
		this.oreNotturne = oreNotturne;
	}
	
	

}
