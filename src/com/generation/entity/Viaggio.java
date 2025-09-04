package com.generation.entity;

import java.util.List;
import java.util.ArrayList;

public class Viaggio {
	private String destinazione;
	//private List<String> persone;
	private int persone;
	private int durata;
	private int anno;
	
	public Viaggio(String destinazione, int persone, int durata, int anno) {
		this.destinazione = destinazione;
		this.persone = persone;
		this.durata = durata;
		this.anno = anno;
	}
	
//	public Viaggio(String destinazione, List<String> persone, int durata, int anno) {
//		this.destinazione = destinazione;
//		this.persone = persone;
//		this.durata = durata;
//		this.anno = anno;
//	}
//	
//	public Viaggio(String[] data) {
//		this.destinazione = data[0];
//		List<String> temp = new ArrayList<String>();
//		for(int i = 0; i <data[1].split(",").length;i++) {
//			temp.add(data[1].split(",")[i]);
//		}
//		this.persone = temp;
//		this.durata = Integer.parseInt (data[2]);
//		this.anno = Integer.parseInt (data[3]);
//	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public List<String> getPersone() {
		return persone;
	}

	public void setPersone(List<String> persone) {
		this.persone = persone;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	@Override
	public String toString() {
		return "Viaggio [destinazione=" + destinazione + ", persone=" + persone + ", durata=" + durata + ", anno="
				+ anno + "]";
	}
	
	
}
