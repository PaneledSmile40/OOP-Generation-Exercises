package com.generation.entity;

public abstract	 class Notifica {

	
	private String destinatario;
	private String mittente;

	public Notifica(String destinatario,String mittente) {
		super();
		this.destinatario = destinatario;
		this.mittente = mittente;
	}

	public String mittente() {
		return destinatario;
	}
	
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public String getMittente() {
		return mittente;
	}

	public void setMittente(String mittente) {
		this.mittente = mittente;
	}

	
	
	@Override
	public String toString() {
		return "Notifica [destinatario=" + destinatario + ", mittente=" + mittente + "]";
	}

	public abstract void invia();
}
