package com.generation.exercises;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//String word = "ingegni";
		
		//System.out.println(Utility.quanteVocali("AIUOLA"));
		//String parola ="lUpIdE";
		//System.out.println(Utility.alContrario(parola));
		//System.out.println(Utility.senzaSpazi("io Sono   La Tempesta"));
		//System.out.println(Utility.isPalindromo("ingegni"));
		
		
		Scanner sc = new Scanner(System.in);
		double temp1;
		double distance1;
		double weight1;
		double volume1;
		int id1;
		
		System.out.println("\n--- Primo Input ---");
		
		System.out.print("Inserisci temperatura (°F): ");
		temp1 = sc.nextDouble();
		System.out.print("Inserisci distanza (miglia): ");
		distance1 = sc.nextDouble();
		System.out.print("Inserisci peso (libbre): ");
		weight1 = sc.nextDouble();
		System.out.print("Inserisci volume (galloni): ");
		volume1 = sc.nextDouble();
		System.out.print("Inserisci codice identificativo: ");
		id1 = sc.nextInt();
		
		temp1 = MathUtils.onlyTwoDecimals( UnitConverter.fahrenheitToCelsius(temp1));
		distance1 = MathUtils.onlyTwoDecimals( UnitConverter.milesToMeters(distance1));
		weight1 = MathUtils.onlyTwoDecimals(UnitConverter.lbsToKgrams(weight1));
		volume1 = MathUtils.onlyTwoDecimals(UnitConverter.gallonsToLiters(volume1));
		
		System.out.println("\n--- Misurzione Dati ---");
		
		System.out.println("Temperatura: " + (MathUtils.isInRange(temp1, 0, 35) == true ? (temp1 + " °C (OK)"):(temp1 + " °C (FUORI RANGE)") ) );
		System.out.println("Distanza: " + (MathUtils.isInRange(distance1, 100, 2000) == true ? (distance1 + "m (OK)"):(distance1 + " m (FUORI RANGE)") ) );
		System.out.println("Peso: " + (MathUtils.isInRange(weight1, 0, 150) == true ? (weight1 + " kg (OK)"):(weight1 + " kg (FUORI RANGE)") ) );
		System.out.println("Volume: " + (MathUtils.isInRange(volume1, 0, 35) == true ? (volume1 + "litri (OK)"):(volume1 + " litri (FUORI RANGE)") ) );
		System.out.println("Codice identificativo: " + (MathUtils.isPrime(id1) == true ? (id1 + " è PRIMO → valido"):(id1 + " non è PRIMO → invalido\"") ) );
		
		
		
		double temp2;
		double distance2;
		double weight2;
		double volume2;
		int id2;
		
		System.out.println("\n--- Secondo Input ---");
		
		System.out.print("Inserisci temperatura (°F): ");
		temp2 = sc.nextDouble();
		System.out.print("Inserisci distanza (miglia): ");
		distance2 = sc.nextDouble();
		System.out.print("Inserisci peso (libbre): ");
		weight2 = sc.nextDouble();
		System.out.print("Inserisci volume (galloni): ");
		volume2 = sc.nextDouble();
		System.out.print("Inserisci codice identificativo: ");
		id2 = sc.nextInt();
		
		temp2 = MathUtils.onlyTwoDecimals( UnitConverter.fahrenheitToCelsius(temp1));
		distance2 = MathUtils.onlyTwoDecimals( UnitConverter.milesToMeters(distance1));
		weight2 = MathUtils.onlyTwoDecimals(UnitConverter.lbsToKgrams(weight1));
		volume2 = MathUtils.onlyTwoDecimals(UnitConverter.gallonsToLiters(volume1));
		
		System.out.println("\n--- Misurzione Dati ---");
		
		System.out.println("Temperatura: " + (MathUtils.isInRange(temp2, 0, 35) == true ? (temp2 + " °C (OK)"):(temp2 + " °C (FUORI RANGE)") ) );
		System.out.println("Distanza: " + (MathUtils.isInRange(distance2, 100, 2000) == true ? (distance2 + "m (OK)"):(distance2 + " m (FUORI RANGE)") ) );
		System.out.println("Peso: " + (MathUtils.isInRange(weight2, 0, 150) == true ? (weight2 + " kg (OK)"):(weight2 + " kg (FUORI RANGE)") ) );
		System.out.println("Volume: " + (MathUtils.isInRange(volume2, 0, 35) == true ? (volume2 + "litri (OK)"):(volume2 + " litri (FUORI RANGE)") ) );
		System.out.println("Codice identificativo: " + (MathUtils.isPrime(id2) == true ? (id2 + " è PRIMO → valido"):(id2 + " non è PRIMO → invalido\"") ) );
		
		
		
		System.out.println("\n--- Report confronto misure --- ");
		
		System.out.println("Temperatura -  Max: " + MathUtils.max(temp1, temp2) + " °C, Min: " + MathUtils.min(temp1, temp2) + " °C");
		System.out.println("Distanza -  Max: " + MathUtils.max(distance1, distance2) + " m, Min: " + MathUtils.min(distance1, distance2) + " m");
		System.out.println("Peso -  Max: " + MathUtils.max(weight1, weight2) + " kg, Min: " + MathUtils.min(weight1, weight2) + " kg");
		System.out.println("Volume -  Max: " + MathUtils.max(volume1, volume2) + " litri, Min: " + MathUtils.min(volume1, volume2) + " litri");
		
		
		sc.close();
		
	}

	

}
