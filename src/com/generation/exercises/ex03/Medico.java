package com.generation.exercises.ex03;

public class Medico extends PersonaleClinico{
	private String specializzazione;
	private boolean strutturato;
	
	public Medico() {}
	public Medico(String nome, String cognome, int eta, String residenza, int anniDiLavoro, double stipendioBase, String reparto, String specializzazione, boolean strutturato) {
		super(nome,cognome,eta,residenza,anniDiLavoro,stipendioBase,reparto);
		setSpecializzazione(specializzazione);
		setStrutturato(strutturato);
	}
	
	
	@Override
	public String toString() {
		return "Medico\n" + super.toString() + "\nSpecializzazione: " + getSpecializzazione() + (isStrutturato()?"Strutturato":"Non strutturato");
	}
	
	
	public boolean isBuonMedico() {
		return (  getAnniDiLavoro() > 3 || (isStrutturato() && getSpecializzazione() == "Pediatria") );
	}
	
	public boolean bonus() {
		return isBuonMedico();
	}
	
	public double stipendioAnnuale(int numMensilità) {
		double stipendioAnnuale;
		stipendioAnnuale = getStipendioBase() * numMensilità;
		
		switch(getSpecializzazione().toLowerCase()) {
		case "ortopedico":
			stipendioAnnuale += stipendioAnnuale * 2 / 100;
			break;
		case "cardiologo":
			stipendioAnnuale += stipendioAnnuale * 5 / 100;
			break;
		case "psichiatra ":
			stipendioAnnuale += stipendioAnnuale * 3 / 100;
			break;
		default:
			stipendioAnnuale += stipendioAnnuale * 0.5 / 100;
		}
		
		if (bonus()) {
			stipendioAnnuale += 3000;
		}
		
		return stipendioAnnuale;
	}
	
	
	public String getSpecializzazione() {
		return specializzazione;
	}
	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione == null ? "Nessuna" : specializzazione;
	}
	public boolean isStrutturato() {
		return strutturato;
	}
	public void setStrutturato(boolean strutturato) {
		this.strutturato = strutturato;
	}
	
	
}
