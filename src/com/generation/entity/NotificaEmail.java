package com.generation.entity;

public class NotificaEmail extends Notifica {

	private String oggetto;
	private String corpo;
	
	public NotificaEmail(String destinatario, String mittente, String oggetto, String corpo) {
		super(destinatario, mittente);
		this.oggetto = oggetto;
		this.corpo = corpo;
	}


	public String getOggetto() {
		return oggetto;
	}

	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	@Override
	public String toString() {
		return "NotificaEmail\n" +  super.toString() + " \noggetto=" + oggetto + ", \ncorpo=" + corpo;
	}

	@Override
	public void invia() {
		System.out.println("Email mandata da " + getDestinatario() + "\nOggetto: " + getOggetto() + "\n" + getCorpo());
		
	}

}
