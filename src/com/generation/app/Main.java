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
//			data = Integer.parseInt(sc.nextLine());
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
		System.out.println("\n\n--Menu Viaggi--\n");
		do {
			System.out.println("Scegli una tra le seguenti opzioni:");
			System.out.println("1) Inserisci nuovo viaggio");
			System.out.println("2) Rimuovi viaggio");
			System.out.println("3) Modifica viaggio");
			System.out.println("4) Stampa lista viaggi");
			System.out.println("5) Esci dal programma\n");
			
			String check = sc.nextLine();
			if( check.matches("[1-9]\\d*") && c > 0 && c <= 5) {
				c = Integer.parseInt(check);
			}else {
				System.out.println("Opzione selezionata non valida");
				c = 0;
				continue;
			}
			
			switch (c) {
			case 1:
				String destinazione;
				int anno, durata;
				List<String> listaDiAmici;
				boolean intercontinentale;
				
				System.out.println("Inserisci la destinazione");
				destinazione = sc.nextLine();
				System.out.println("Inserisci l'anno del viaggio");
				anno = Integer.parseInt(sc.nextLine());
				System.out.println("Inserisci durata in giorni");
				durata = Integer.parseInt(sc.nextLine());
				
				//TODO complete interactive menu
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("non so come hai fatto ad arrivare qui, non dovrebbe essere possibile");
				c=0;			
			}
			

		} while (c != 5);

		sc.close();

	}

}
