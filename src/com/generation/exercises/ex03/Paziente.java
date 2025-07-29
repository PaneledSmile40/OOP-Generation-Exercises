package com.generation.exercises.ex03;

public class Paziente extends Person {
	private String reparto;
	private int giorniDiRicovero;
	private double costoGiornaliero;
	private String diagnosi;
	
	public Paziente() {}
	public Paziente(String nome,String cognome,int eta,String residenza, String reparto, int giorniDiRicovero, double costoGiornaliero, String diagnosi) {
		super(nome,cognome,eta,residenza);
		setReparto(reparto);
		setGiorniDiRicovero(giorniDiRicovero);
		setCostoGiornaliero(costoGiornaliero);
		setDiagnosi(diagnosi);
	}
	
	@Override
	public String toString() {
		return "Paziente\n" + super.toString() + "\nreparto: " + getReparto() + "\nGiorni di ricovero: " + getGiorniDiRicovero() + "\nCosto giornaliero: " + getCostoGiornaliero() + "Diagnosi: " +getDiagnosi();
	}
	
	public String getReparto() {
		return reparto;
	}
	public void setReparto(String reparto) {
		this.reparto = reparto;
	}
	public int getGiorniDiRicovero() {
		return giorniDiRicovero;
	}
	public void setGiorniDiRicovero(int giorniDiRicovero) {
		this.giorniDiRicovero = giorniDiRicovero;
	}
	public double getCostoGiornaliero() {
		return costoGiornaliero;
	}
	public void setCostoGiornaliero(double costoGiornaliero) {
		this.costoGiornaliero = costoGiornaliero;
	}
	public String getDiagnosi() {
		return diagnosi;
	}
	public void setDiagnosi(String diagnosi) {
		this.diagnosi = diagnosi;
	}

	
}
