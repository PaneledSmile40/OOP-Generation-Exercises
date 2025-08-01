package com.generation.interfaces;

import com.generation.entities.OD;

public interface ODinterface {
	default public void stampaOpera(String opera) {
		if (((OD)this).isEsposta()) {
		System.out.println(opera);
		}
	}
	public String stampIngombro();
	public void cambiaEsposizione();
	
}	
