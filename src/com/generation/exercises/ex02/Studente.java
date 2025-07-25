package com.generation.exercises.ex02;

public class Studente {
	String nome,cognome;
	int eta,votoIta,votoMusica,votoStoria;
	
	public Studente() {}
	public Studente (String nome, String cognome, int eta, int votoIta, int votoMusica, int votoStoria ) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.votoIta = votoIta;
		this.votoMusica = votoMusica;
		this.votoStoria = votoStoria;
	}
	
	
	public String infoStudente() {
		//nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toUpperCase();
		//cognome = cognome.substring(0, 1).toUpperCase() + cognome.substring(1).toUpperCase();
		return (
				"Studente: " + nome + " " + cognome + 
				"\nAnni: " + eta + 
				"\nVoto Italiano: " + votoIta + 
				"\nVoto Musica: " + votoMusica + 
				"\nVoto Storia: " + votoStoria
				);
	}
	
	public static int sum(int voto1, int voto2, int voto3) {
		return (voto1 + voto2 + voto3);
	};
	
	public static boolean atLeastTwo(int voto1, int voto2, int voto3) {
		//int c=0;
		//if(voto1 >= 6) {c++;}
		//if(voto2 >= 6) {c++;}
		//if(voto3 >= 6) {c++;}
		//return c >= 2; // ? true : false;
		return ((voto1>=6 && voto2>=6)||(voto1>=6 && voto3>=6)||(voto2>=6 && voto3>=6));
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
	
	
	
	
	
}
