package com.generation.entities;

public class S extends OD{
	protected double altezza,larghezza,profondita;

	public S(){};
	public S(String titolo, String artista, boolean esposta, double altezza, double larghezza, double profondita) {
		super(titolo, artista, esposta);
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondita = profondita;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}
	
	public double getProfondita() {
		return profondita;
	}

	public void setProfondita(double profondita) {
		this.profondita = profondita;
	}

	@Override
	public String toString() {
		return "Quadro" + super.toString() + "\naltezza: " + altezza + "\nlarghezza: " + larghezza + "\nprofondità: " + profondita;
	}

	@Override
	public String stampIngombro() {
		return printIngombro()+" m^3";
	}
	
	@Override
	public double printIngombro() {
		return altezza*larghezza*profondita;
	};
}
