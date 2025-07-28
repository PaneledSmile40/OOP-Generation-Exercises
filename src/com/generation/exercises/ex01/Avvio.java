package com.generation.exercises.ex01;

public class Avvio {

	public static void main(String[] args) {
		Studente student01 = new Studente("Mario","Rossi", 26, 7, 8, 9);
		Studente student02 = new Studente("Maria", "Bianchi", 27, 10, 6, 1);
		Studente student03 = new Studente("Giancarlo" ,"Esposito", 16, 5, 7, 8);
		Studente student04 = new Studente("Diego Armando","Maradona", 70, 5, 5, 10);
		
		//student02.setVotoIta(7);
		//student03.setVotoMusica(4);
		//student04.setNome("Diego");
		
		//System.out.println("Prima dei cambiamenti\n" + student01.infoStudente());
		//System.out.println("La media di " + student01.getNome() + " " + student01.getCognome() + " è " + (student01.isMaggiorenne() ? "maggiorenne" : "minorenne"));
		//System.out.println("Lo studente " + student01.getNome() + " " + student01.getCognome() + " è " + (student01.isPromosso() ? "promosso!" : "bocciato"));
		//System.out.println("La media di " + student01.getNome() + " " + student01.getCognome() + " è " + student01.media());
		
		//student01.setEta(student01.getEta()+1);
		//student01.setVotoStoria(1);
		
		//System.out.println("\nDopo dei cambiamenti\n" + student01.infoStudente());
		//System.out.println("La media di " + student01.getNome() + " " + student01.getCognome() + " è " + (student01.isMaggiorenne() ? "maggiorenne" : "minorenne"));
		//System.out.println("Lo studente " + student01.getNome() + " " + student01.getCognome() + " è " + (student01.isPromosso() ? "promosso!" : "bocciato"));
		//System.out.println("La media di " + student01.getNome() + " " + student01.getCognome() + " è " + student01.media());
		
		Docente docente01 = new Docente("Sofia","Tombolini",35,180,15,true);
		Mentor	mentor01  = new Mentor ("Massimo","Porto",31,96,12,4);
		

	}

}
