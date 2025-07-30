package com.generation.exercises.ex04;

import java.util.Scanner;

public class Avvio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Benvenuto allo sportello della banca");
		
		System.out.println("Apri il tuo conto corrente");
		System.out.println("Imposta il tuo saldo iniziale:");
		double saldoIniziale = sc.nextDouble();
		System.out.println("Impost il tuo PIN:");
		int pin = sc.nextInt();
		ContoCorrente conto01 = new ContoCorrente(saldoIniziale,pin);
		
		
		int c=0;
		while(c!=5) {
			System.out.println("\nScegli una delle seguenti operazioni:");
			System.out.println("1) Visualizza il tuo saldo");
			System.out.println("2) Visualizza estratto conto");
			System.out.println("3) Effettua un prelievo");
			System.out.println("4) Effettua un deposito");
			System.out.println("5) Esci dall'interfaccia");
			c=sc.nextInt();
			
			switch (c) {
			case 1:
				
				System.out.println("Il tuo saldo attuale è di " + conto01.getBalance() + "€");
				break;
				
			case 2:
				
				System.out.println("Di seguito il tuo estratto conto:\n" + conto01.getHistory());
				break;
				
			case 3:
				
				for(int i=0;i<3;i++) {
					if(i==0)System.out.println("Inserire il PIN: ");
					else System.out.println("PIN errato, " + (3-i) + " possibilità rimanenti\nInserire il PIN: ");
					
					int pin = sc.nextInt();
					if (pin==conto01.getPin()) {
						System.out.println("Inserire importo da prelevare: ");
						double sum = sc.nextDouble();
						conto01.withdraw(sum);
						break;
					}	
				}
				System.out.println("Tentativi esauriti, uscita dall'interfaccia");
				return;
				
			case 4:
				System.out.println("Inserire importo da depositare: ");
				double sum = sc.nextDouble();
				conto01.deposit(sum);
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("Opzione inserita non disponibile\n");
				
			}		
		}	
		System.out.println("Arrivederci!");
		sc.close();
	}

}
