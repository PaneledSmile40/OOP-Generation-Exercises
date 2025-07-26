package com.generation.exercises.ex02;

public class Studente {
	private String nome,cognome;
	private int eta,votoIta,votoMusica,votoStoria;
	
	public Studente() {}
	public Studente (String nome, String cognome, int eta, int votoIta, int votoMusica, int votoStoria ) {
		setNome(nome);
		setCognome(cognome);
		setEta(eta);
		setVotoIta(votoIta);
		setVotoMusica(votoMusica);
		setVotoStoria(votoStoria);
	}
	
	
	public String infoStudente() {
		//nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toUpperCase();
		//cognome = cognome.substring(0, 1).toUpperCase() + cognome.substring(1).toUpperCase();
		return (
				"Studente: " + getNome() + " " + getCognome() + 
				"\nAnni: " + getEta() + 
				"\nVoto Italiano: " + getVotoIta() + 
				"\nVoto Musica: " + getVotoMusica() + 
				"\nVoto Storia: " + getVotoStoria()
				);
	}
	
	public static int sum(int voto1, int voto2, int voto3) {
		return (voto1 + voto2 + voto3);
	};
	
	public static boolean atLeastTwo(int voto1, int voto2, int voto3) {
		int c=0;
		if(voto1 >= 6) {c++;}
		if(voto2 >= 6) {c++;}
		if(voto3 >= 6) {c++;}
		return c >= 2; // ? true : false;
	}
	
	
	public double media() {
		return (double)((int)(((double)sum(votoIta,votoMusica,votoStoria) / 3)*100))/100;
	}
	
	
	public boolean isMaggiorenne() {
		return eta >= 18; //? true : false; 
	}
	
	
	public boolean isPromosso() {
		return (media() >= 6 && atLeastTwo(votoIta,votoMusica,votoStoria)); //? true : false;
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
	public int getVotoIta() {
		return votoIta;
	}
	public void setVotoIta(int votoIta) {
		this.votoIta = votoIta;
	}
	public int getVotoMusica() {
		return votoMusica;
	}
	public void setVotoMusica(int votoMusica) {
		this.votoMusica = votoMusica;
	}
	public int getVotoStoria() {
		return votoStoria;
	}
	public void setVotoStoria(int votoStoria) {
		this.votoStoria = votoStoria;
	}
	
	
	
	
	
}
