package com.generation.entity;

public class NotificaPush extends Notifica {
	
	private String messaggio;
	private String titolo;
	public NotificaPush(String destinatario, String mittente, String messaggio, String titolo) {
		super(destinatario, mittente);
		this.messaggio = messaggio;
		this.titolo = titolo;
	}
	
	
	
	public String getMessaggio() {
		return messaggio;
	}



	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}



	public String getTitolo() {
		return titolo;
	}



	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	

	@Override
	public String toString() {
		return "NotificaPush da: " + getMittente() +",\ntitolo: "  + titolo + "\nmessaggio: " + messaggio ;
	}



	@Override
	public void invia() {
		System.out.println("Priorità: " + titolo);
		
	}
	
	

}
