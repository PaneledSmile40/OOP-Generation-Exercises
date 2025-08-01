package com.generation.entities;

public class Q extends OD{
	protected double altezza,larghezza;
	
	public Q(){};
	public Q(String titolo, String artista, boolean esposta, double altezza, double larghezza) {
		super(titolo, artista, esposta);
		this.altezza = altezza;
		this.larghezza = larghezza;
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

	@Override
	public String toString() {
		return "Quadro" + super.toString() + "\naltezza: " + altezza + "\nlarghezza: " + larghezza ;
	}

	//@Override
	//public String stampIngombro() {
	//	return printIngombro()+" m^2";
	//}
	
	@Override
	public double printIngombro() {
		return altezza*larghezza;
	};

}
