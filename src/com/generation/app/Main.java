package com.generation.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi inserire?");
		int c = sc.nextInt();
		int[] numeri = new int[c];
		
		for(int i=0; i < c;i++) {
			System.out.println("Inserire numeri interi");
			numeri[i] = sc.nextInt();;
		}
		
//		System.out.println("Stampa array");
//		for(int i=0; i < numeri.length;i++) {
//			System.out.println(numeri[i]);
//		}
//		
//		int somma=0;
//		for(int i=0; i < numeri.length;i++) {
//			somma+=numeri[i];
//		}
//		System.out.println("La somma dei numeri nell'array è: " + somma);
//		
//		int divisore=numeri.length;
//		for(int i=0; i < numeri.length;i++) {
//			if(numeri[i]!=0)continue;
//			divisore--;
//		}
//		double media = somma/divisore;
//		System.out.println("La media dei numeri nell'array escludendo gli zeri è: " + media);
		
		
		int max=0,min=0;
		for(int i=0; i < numeri.length;i++) {
			if(i==0) {
				max=numeri[i];
				min=numeri[i];
				continue;
			}
			if(numeri[i]>max) {
				max=numeri[i];
			}else if(numeri[i]<min){
				min=numeri[i];
			}
			
		}
		System.out.println("Numero maggiore: " + max);
		System.out.println("Numero minore: " + min);
		
		sc.close();
		

	}

}
