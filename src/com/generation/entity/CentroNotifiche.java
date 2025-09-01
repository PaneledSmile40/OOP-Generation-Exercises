package com.generation.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CentroNotifiche {

	private List<Notifica> notifiche;
	
	private CentroNotifiche(String percorso) throws FileNotFoundException  {
		List<String> righe = leggiRigheFile(percorso);
		Notifica n = null;
		String[] rigaSplittata;
		
		for(String riga: righe) {
			rigaSplittata = riga.split(","); 
			switch(rigaSplittata[0].toLowerCase()) {
			case "sms" -> n = new NotificaSMS(rigaSplittata[1], null, rigaSplittata[3]);
			case "push" -> n = new NotificaPush(rigaSplittata[1], null, rigaSplittata[3], rigaSplittata[2]);
			case "email" -> n = new NotificaEmail(rigaSplittata[1], null, rigaSplittata[3], rigaSplittata[2]);
			default -> System.out.println(riga + ": caso non previsto");
			}
			notifiche.add(n);
		}
	}
	
	public static List<NotificaPush> notifichePush(List<Notifica> listaNotifiche){
		List<NotificaPush> notifichePush = new ArrayList<NotificaPush>();
		for (Notifica notifica:listaNotifiche) {
			if(notifica instanceof NotificaPush np) {
				notifichePush.add(np);
			}
		}
		return notifichePush;	
	}
	
//	public static List<NotificaPush> notifichePush(List<Notifica> listaNotifiche){
//		List<NotificaPush> notifichePush = new ArrayList<NotificaPush>();
//		for (Notifica notifica:listaNotifiche) {
//			if(notifica instanceof NotificaPush) {
//				notifichePush.add((NotificaPush)notifica);
//			}
//		}
//		return notifichePush;	
//	}
	
	public static List<NotificaEmail> notificheEmail(List<Notifica> listaNotifiche){
		List<NotificaEmail> NotificheEmail = new ArrayList<NotificaEmail>();
		for (Notifica notifica:listaNotifiche) {
			if(notifica instanceof NotificaEmail ne) {
				NotificheEmail.add(ne);
			}
		}
		return NotificheEmail;	
	}
	
	public static List<NotificaSMS> notificheSMS(List<Notifica> listaNotifiche){
		List<NotificaSMS> notificheSMS = new ArrayList<NotificaSMS>();
		for (Notifica notifica:listaNotifiche) {
			if(notifica instanceof NotificaSMS ne) {
				notificheSMS.add(ne);
			}
		}
		return notificheSMS;	
	}
	
	public static List<NotificaPush> TitoliNotifichePushMittenteDestinatario(List<NotificaPush> notifichePush, String mittente, String destinatario){
		String ris = "Titoli notifiche push da " + mittente + " a " + destinatario + ":" ;
		for (NotificaPush n:notifichePush) {
			if(n.getDestinatario().equals(destinatario) && n.getMittente().equals(mittente)) {
				
			}
		}
		return ris;	
	}
	
	
	
	
	
	
	private static List<String> leggiRigheFile(String percorso) throws FileNotFoundException  {
		List <String>	righe  = new ArrayList<String>();
		Scanner scanner = new Scanner(new File(percorso));
		
		scanner.nextLine();
		while(scanner.hasNextLine()) {
			righe.add(scanner.nextLine());
		}
		
		scanner.close();
		return righe;
	}
	
}
