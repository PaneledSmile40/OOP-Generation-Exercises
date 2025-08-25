package com.generation.avvio;

import java.time.LocalDate;

import com.generation.entity.Articolo;

public class Main {

	public static void main(String[] args) {
		Articolo Scarpe = new Articolo("scarpe da trekking",LocalDate.of(2025,07,20));
		Articolo MutaSub = new Articolo("muta da sub",LocalDate.of(2024,03,16));
		Articolo Corda = new Articolo("corda da arrampicata",LocalDate.of(2022,9,16));
		
		String temp = Articolo.confronta(Scarpe,MutaSub);
		String piuVecchio = temp.equalsIgnoreCase("scarpe da trekking") ? Articolo.confronta(Scarpe,Corda) : Articolo.confronta(MutaSub,Corda);
		
		
		
		
		System.out.println(Scarpe.getBarcode());
		System.out.println(Corda.getBarcode());
		
		System.out.println("L'articolo più vecchio è: " + piuVecchio);
		
	}

}
