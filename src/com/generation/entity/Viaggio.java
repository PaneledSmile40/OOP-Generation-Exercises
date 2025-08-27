package com.generation.entity;

import java.util.List;

public class Viaggio {
	private String destinazione;
	private int anno, durata;
	private List<String> listaDiAmici;
	private boolean intercontinentale;
	
	
	
	public Viaggio(String destinazione, int anno, int durata, List<String> listaDiAmici, boolean intercontinentale ) {
		this.destinazione = destinazione;
		this.anno = anno;
		this.durata = durata;
		this.listaDiAmici = listaDiAmici;
		this.intercontinentale = intercontinentale;
	}
	
	@Override
	public String toString() {
		return "\nViaggio:\n Destinazione: " + destinazione + ", Anno: " + anno + ", Durata: " + durata + ", Lista accompagnatori: "
				+ listaDiAmici + ", Intercontinentale: " + (intercontinentale==true? "Si" : "No");
	}

	public String getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public List<String> getListaDiAmici() {
		return listaDiAmici;
	}
	public void setListaDiAmici(List<String> listaDiAmici) {
		this.listaDiAmici = listaDiAmici;
	}
	public boolean isIntercontinentale() {
		return intercontinentale;
	}
	public void setIntercontinentale(boolean intercontinentale) {
		this.intercontinentale = intercontinentale;
	}
	
	

}
