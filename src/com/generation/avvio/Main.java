package com.generation.avvio;

import java.time.LocalDate;

import com.generation.entity.Articolo;

public class Main {

	public static void main(String[] args) {
		Articolo Scarpe = new Articolo("scarpe da trekking",LocalDate.of(2025,07,20));
		Articolo MutaSub = new Articolo("muta da sub",LocalDate.of(2025,07,20));
		Articolo Corda = new Articolo("corda da arrampicata",LocalDate.of(2022,9,16));
		
		//int temp = Articolo.confronta(Scarpe,MutaSub);
		//if(temp == 0) {
		//	if (Articolo.confronta(Scarpe,Corda)<0) {
		//		System.out.println("Gli articoli più vecchi sono: " + Scarpe.getTitolo() + MutaSub.getTitolo());
		//	}else {
		//		System.out.println("L'articoli più vecchio è: " + Corda.getTitolo());
		//	}
		//}
		
		if(Articolo.confronta(Scarpe,MutaSub)<=0) {
			if(Articolo.confronta(Scarpe,Corda)<=0) {
				if(Articolo.confronta(Scarpe,Corda)<0) {
					System.out.println("L'articolo più vecchio è: " + Scarpe.getTitolo());
				}else {
					System.out.println("Gli articoli più vecchi  sono: " + Scarpe.getTitolo() + " " + Corda.getTitolo());
				}
			}else {
				
			}
		}
		
		
		System.out.println(Articolo.getNumeroArticoli());
		
		System.out.println(Scarpe.getBarcode());
		System.out.println(MutaSub.getBarcode());
		
		System.out.println("L'articolo più vecchio è: " + piuVecchio);
		
	}

}
