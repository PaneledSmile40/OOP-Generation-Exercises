package com.generation.entity;

public class NotificaSMS extends Notifica {
	private String messagio;

	public NotificaSMS(String destinatario, String mittente, String messagio) {
		super(destinatario, mittente);
		this.messagio = messagio;
	}

	
	
	public String getMessagio() {
		return messagio;
	}

	public void setMessagio(String messagio) {
		this.messagio = messagio;
	}


	
	



	@Override
	public String toString() {
		return "SMS\nMittente: " + getMittente() + "\nmessagio=" + messagio + "]";
	}



	@Override
	public void invia() {
		System.out.println("Notifica SMS da " + getMittente());
		
	}
	
}
