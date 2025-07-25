package com.generation.exercises.ex02;



public class Avvio {

	public static void main(String[] args) {
		Studente student01 = new Studente("Mario","Rossi", 26, 7, 8, 9);
		Studente student02 = new Studente("Maria", "Bianchi", 27, 10, 6, 1);
		Studente student03 = new Studente("Giancarlo" ,"Esposito", 16, 5, 7, 8);
		Studente student04 = new Studente("Diego Armando","Maradona", 70, 5, 5, 10);
		
		System.out.println(student01.infoStudente());
		System.out.println("La media di " + student01.nome + " " + student01.cognome + " è " + (student01.isMaggiorenne() ? "maggiorenne" : "minorenne"));
		System.out.println("Lo studente " + student01.nome + " " + student01.cognome + " è " + (student01.isPromosso() ? "promosso!" : "bocciato"));
		System.out.println("La media di " + student01.nome + " " + student01.cognome + " è " + student01.media());
		
		System.out.println("");
		System.out.println(student02.infoStudente());
		System.out.println("La media di " + student02.nome + " " + student02.cognome + " è " + (student02.isMaggiorenne() ? "maggiorenne" : "minorenne"));
		System.out.println("Lo studente " + student02.nome + " " + student02.cognome + " è " + (student02.isPromosso() ? "promosso!" : "bocciato"));
		System.out.println("La media di " + student02.nome + " " + student02.cognome + " è " + student02.media());
		
		System.out.println("");
		System.out.println(student03.infoStudente());
		System.out.println("La media di " + student03.nome + " " + student03.cognome + " è " + (student03.isMaggiorenne() ? "maggiorenne" : "minorenne"));
		System.out.println("Lo studente " + student03.nome + " " + student03.cognome + " è " + (student03.isPromosso() ? "promosso!" : "bocciato"));
		System.out.println("La media di " + student03.nome + " " + student03.cognome + " è " + student03.media());
		
		System.out.println("");
		System.out.println(student04.infoStudente());
		System.out.println("La media di " + student04.nome + " " + student04.cognome + " è " + (student04.isMaggiorenne() ? "maggiorenne" : "minorenne"));
		System.out.println("Lo studente " + student04.nome + " " + student04.cognome + " è " + (student04.isPromosso() ? "promosso!" : "bocciato"));
		System.out.println("La media di " + student04.nome + " " + student04.cognome + " è " + student04.media());
	}

}
