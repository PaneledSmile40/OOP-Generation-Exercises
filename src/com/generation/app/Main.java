package com.generation.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.generation.entity.Viaggio;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Viaggio> viaggi = new ArrayList<Viaggio>();
		viaggi.add(new Viaggio("Francia", 2022, 12, new ArrayList<>(List.of("Luca", "Andrea", "Federico")), false));
		viaggi.add(new Viaggio("Giappone", 2023, 18, new ArrayList<>(List.of("Giulia", "Marco")), true));
		viaggi.add(
				new Viaggio("Spagna", 2021, 10, new ArrayList<>(List.of("Sara", "Paolo", "Elena", "Giorgio")), false));
		viaggi.add(new Viaggio("Canada", 2024, 15, new ArrayList<>(List.of("Alessia", "Davide")), true));
		viaggi.add(new Viaggio("Grecia", 2020, 7, new ArrayList<>(List.of("Marta")), false));

		List<Viaggio> viaggiInter = new ArrayList<Viaggio>();
		for (Viaggio v : viaggi) {
			if (v.isIntercontinentale() == true)
				viaggiInter.add(v);
		}
		// List<String> viaggiInterDestAnno = new ArrayList<String>();
		String viaggiInterDestAnno = "Viaggi intercontinentali:";
		for (Viaggio v : viaggiInter)
			viaggiInterDestAnno += "\nViaggio: " + v.getDestinazione() + " in anno " + v.getAnno();
		System.out.println(viaggiInterDestAnno);

		System.out.println("---------------------------------");
		int indexPiuAmici = 0;
		// List<Integer> indexPiuAmici = new ArrayList<Integer>();

		for (Viaggio v : viaggi)
			if (viaggi.get(indexPiuAmici).getListaDiAmici().size() < v.getListaDiAmici().size()) {
				indexPiuAmici = viaggi.indexOf(v);
			}

		for (int i = 1; i < viaggi.size(); i++) {
			if (viaggi.get(i).getListaDiAmici().size() > viaggi.get(indexPiuAmici).getListaDiAmici().size()) {
				indexPiuAmici = i;
			}
		}

		Viaggio piuAmici = new Viaggio(viaggi.get(indexPiuAmici).getDestinazione(), viaggi.get(indexPiuAmici).getAnno(),
				viaggi.get(indexPiuAmici).getDurata(), viaggi.get(indexPiuAmici).getListaDiAmici(),
				viaggi.get(indexPiuAmici).isIntercontinentale());

		System.out.println("Viaggio: " + piuAmici.getDestinazione() + " in anno: " + piuAmici.getAnno());

		// TODO edge case viaggi con stesso num amici
//		List<Viaggio> viaggiPiuAmiciDestAnno = new ArrayList<Viaggio>();
//		for (Viaggio v : viaggiPiuAmiciDestAnno)
//			viaggiAmiciDestAnno.add("Destinazione: " + v.getDestinazione() + "\nAnno: " + v.getAnno());
//		(viaggiAmiciDestAnno);

		System.out.println("---------------------------------");
		int data = 2023;
//		int data;	
//		System.out.println("Stampa di tutti i viaggi posteriori ad una data specificata (data inclusa)");
//		System.out.println("Inserisci la data");
//		do {
//			data = Integer.parseInt(sc.nextLine());  // inserire check dati
//			if (data > 2025)
//				System.out.println("data invalida, inserire una data valida minore o uguale a 2025");
//		} while (data > 2025);

		List<Viaggio> viaggiDopoData = new ArrayList<Viaggio>();
		for (Viaggio v : viaggi) {
			if (v.getAnno() >= data) {
				viaggiDopoData.add(v);
			}
		}
		String stringedViaggiDopoData = new String();
		for (Viaggio v : viaggiDopoData) {
			stringedViaggiDopoData += v.toString();
		}
		System.out.println(viaggiDopoData.isEmpty() ? "Nessun viaggio effettuato in data " + data + " o successivamente"
				: "I viaggi effettuati nel e dopo il " + data + " sono:\n" + stringedViaggiDopoData);

		System.out.println("---------------------------------");
		int giorni = 10;
		List<Viaggio> viaggiDieciGiorni = new ArrayList<Viaggio>();
		for (Viaggio v : viaggi) {
			if (v.getDurata() >= giorni) {
				viaggiDieciGiorni.add(v);
			}
		}
		String stringedViaggiDieciGiorni = new String();
		for (Viaggio v : viaggiDieciGiorni) {
			stringedViaggiDieciGiorni += v.toString();
		}
		System.out.println(viaggiDieciGiorni.isEmpty() ? "Nessun viaggio effettuato dalla durata di 10 o più giorni"
				: "I viaggi di durata pari o superiore ai 10 giorni sono:\n" + stringedViaggiDieciGiorni);

		int c = 0;
		System.out.println("\n--Menu Viaggi--\n");
		do {
			System.out.println("\nScegli una tra le seguenti opzioni:");
			System.out.println("1) Inserisci nuovo viaggio");
			System.out.println("2) Rimuovi viaggio");
			System.out.println("3) Modifica viaggio");
			System.out.println("4) Stampa lista viaggi");
			System.out.println("5) Esci dal programma\n");

			String checkInt = sc.nextLine();
			if (checkInt.matches("[1-9]\\d*") && Integer.parseInt(checkInt) > 0 && Integer.parseInt(checkInt) <= 5) {
				c = Integer.parseInt(checkInt);
			} else {
				System.out.println("\n! Opzione selezionata non valida ! \n");
				c = 0;
				continue;
			}

			switch (c) {
			case 1:
				
				String destinazione;
				int anno, durata;
				List<String> listaAmici = new ArrayList<String>();
				boolean intercontinentale = false;

				System.out.println("Inserisci la destinazione");
				destinazione = sc.nextLine(); // aggiungere check inserimento dati???

				System.out.println("Inserisci l'anno del viaggio");
				anno = Integer.parseInt(sc.nextLine()); // aggiungere check inserimento dati

				System.out.println("Inserisci durata in giorni");
				durata = Integer.parseInt(sc.nextLine()); // aggiungere check inserimento dati

				String amiciLoop = "first_iteration";
				do {

					if (!amiciLoop.equals("first_iteration")) {
						System.out.println("Inserimento invalido");
					}

					System.out.println("Sei stato accompagnato da amici? Y/N");
					amiciLoop = sc.nextLine();

					if (amiciLoop.equalsIgnoreCase("Y")) {
						System.out.println("Da quanti amici sei stato accompagnato?");
						int numeroAmici = Integer.parseInt(sc.nextLine()); // aggiungere check inserimento dati
						System.out.println("Inserisci gli accompagnatori");
						for (int i = 0; i < numeroAmici; i++) {
							System.out.println("Amico " + (i + 1) + ": ");
							listaAmici.add(sc.nextLine()); // aggiungere check inserimento dati
						}
						System.out.println(listaAmici);
					}

				} while (!(amiciLoop.equalsIgnoreCase("y") || amiciLoop.equalsIgnoreCase("n")));

				String interLoop = "first_iteration";
				do {
					if (!interLoop.equals("first_iteration"))
						System.out.println("Inserimento invalido");

					System.out.println("E' un viaggio intercontinentale? Y/N");
					interLoop = sc.nextLine();

					if (interLoop.equalsIgnoreCase("y"))
						intercontinentale = true;
					if (interLoop.equalsIgnoreCase("n"))
						intercontinentale = false;

				} while (!(interLoop.equalsIgnoreCase("y") || interLoop.equalsIgnoreCase("n")));
				
				System.out.println("I dati inseriti sono: " + destinazione + ", " + anno + ", " + durata+ ", " + (listaAmici.isEmpty()? "nessun amico" : listaAmici) + " e " + intercontinentale + ";");
				System.out.println("Per confermare inserire Y, per annullare inserire qualsiasi altro carattere");
				String conferma = sc.nextLine();
				if(conferma.equalsIgnoreCase("y")) {
					viaggi.add(new Viaggio("destinazione", anno, durata, listaAmici, intercontinentale));
					System.out.println("Inserimento viaggio riuscito");
					//System.out.println(viaggi.getLast());
				}else
					System.out.println("Inserimento viaggio annullato");
						
				break;
				
			case 2:
				System.out.println("Quale viaggio vuoi rimuovere?");
				System.out.println("0) Annulla rimozione");
				for(int i = 0; i < viaggi.size(); i++) {
					System.out.println((i+1) + ") " + viaggi.get(i).getDestinazione());					
				}
				
				int revoIndex = Integer.parseInt(sc.nextLine()); //controllo valore inserito
				
				if(revoIndex == 0) {
					System.out.println("Rimozione annullata");
					break;
				}
				
				viaggi.remove(revoIndex-1);
				System.out.println("Il viaggio " + (revoIndex) + " è stato rimosso");
				
				break;
				
				
			case 3:
				
				System.out.println("Quale viaggio vuoi modificare?");
				System.out.println("0) Annulla modifica");
				for(int i = 0; i < viaggi.size(); i++) {
					System.out.println((i+1) + ") " + viaggi.get(i).getDestinazione());					
				}
				
				int modIndex = Integer.parseInt(sc.nextLine()); //controllo valore inserito
				
				if(modIndex == 0) {
					System.out.println("Modifica annullata");
					break;
				}
				
				System.out.println("Cosa vuoi modificare?");
				
				System.out.println("1) Destinazione: " + viaggi.get(modIndex).getDestinazione());
				System.out.println("2) Anno: " + viaggi.get(modIndex).getAnno());
				System.out.println("3) Durata: " + viaggi.get(modIndex).getDurata());
				System.out.println("4) Lista Amici " + viaggi.get(modIndex).getListaDiAmici());
				System.out.println("5) Intercontinentale: " + viaggi.get(modIndex).isIntercontinentale());
				System.out.println("6) Modifica tutti i campi");
				
				int mode = Integer.parseInt(sc.nextLine()); //controllo valore inserito
				
				switch (mode) {
					case 1:
						
						System.out.println("Inserire nuovo valore per destinazione");
						String destination = sc.nextLine(); //controllo valore inserito
						viaggi.get(modIndex).setDestinazione(destination);
						System.out.println("valore di destinazione modificato con successo");
						break;
						
					case 2:
						
						System.out.println("Inserire nuovo valore per anno");
						int year = Integer.parseInt(sc.nextLine()); //controllo valore inserito
						viaggi.get(modIndex).setAnno(year);
						System.out.println("Valore di anno modificato con successo");
						break;
						
					case 3:
						
						System.out.println("Inserire nuovo valore per durata");
						int duration = Integer.parseInt(sc.nextLine()); //controllo valore inserito
						viaggi.get(modIndex).setDurata(duration);
						System.out.println("Valore di durata modificato con successo");
						break;
						
					case 4:
						
						List<String> newList = new ArrayList<String>();
						System.out.println("Da quanti amici sei stato accompagnato?");
						int numeroAmici = Integer.parseInt(sc.nextLine()); // aggiungere check inserimento dati
						
						if (numeroAmici == 0) {
							viaggi.get(modIndex).setListaDiAmici(newList);
							System.out.println("Lista accompagnatori aggiornata");
							break;
						}
							
						System.out.println("Inserisci gli accompagnatori");
						for (int i = 0; i < numeroAmici; i++) {
							System.out.println("Amico " + (i + 1) + ": ");
							newList.add(sc.nextLine()); // aggiungere check inserimento dati
						}
						viaggi.get(modIndex).setListaDiAmici(newList);
						System.out.println("Lista accompagnatori aggiornata");
						break;
						
					case 5:
						viaggi.get(modIndex).setIntercontinentale(!viaggi.get(modIndex).isIntercontinentale());
						System.out.println("Valore di intercontinentale modificato a: " + viaggi.get(modIndex).isIntercontinentale());
					default:
						System.out.println("neanche qui dovrebbe essere possibile  arrivare");
						break;
				}
				break;
				
			case 4:
				System.out.println(viaggi);
				
				break;
			case 5:
				System.out.println("Uscita dal programma");
				break;
			default:
				System.out.println("non so come hai fatto ad arrivare qui, non dovrebbe essere possibile");
				c = 0;
			}

		} while (c != 5);

		sc.close();

	}

}
