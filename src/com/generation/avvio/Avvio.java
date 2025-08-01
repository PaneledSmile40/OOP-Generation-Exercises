package com.generation.avvio;

import java.util.Scanner;
//import com.generation.entities.ODcreator;
//import com.generation.interfaces.ODinterface;
//import com.generation.entities.Q;
//import com.generation.entities.OD;

public class Avvio {

	public static void main(String[] args) {
		
		//ODinterface opera01 = ODcreator.crea("quadro");
		//((Q)opera01).setEsposta(false);
		//opera01.stampaOpera(((OD)opera01).toString());
		
		Scanner sc = new Scanner(System.in);
		
		String tempTipo;
		String tempTitolo,tempArtista;
		boolean tempEsposta;
		double  tempLunghezza,tempLarghezza,tempProfondita;
		
		System.out.println("Benvenuto!");
		System.out.println("Inserisci la tua prima opera d'arte!");
		do {
			System.out.println("Che tipo di opera vuoi? scegli 'quadro' o 'scultura'");
			tempTipo=sc.nextLine();
		}while(!(tempTipo=="quadro" || tempTipo=="scultura")==false);
		
		System.out.println("Inserire Titolo dell'opera");
		tempTitolo=sc.nextLine();
		System.out.println("Inserire nome dell'artista");
		tempArtista=sc.nextLine();
		System.out.println("Stabilire se l'opera inizialmente è esposta oppure no  'true' o  'false'");
		tempEsposta=sc.nextBoolean();
		System.out.println("Inserire lunghezza opera");
		tempLunghezza=sc.nextDouble();
		System.out.println("Inserire larghezza opera");
		tempLarghezza=sc.nextDouble();
		if(tempTipo=="scultura") {
		System.out.println("Inserire profondità opera");
		tempProfondita=sc.nextDouble();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
