package com.generation.entity;

import com.generation.interfaces.Pagamento;

public class Ordine {
	private double totale;
	
	public Ordine() {}
	public Ordine(double totale) {
		this.totale=totale;
	}
	
	public double getTotale() {
		return totale;
	}
	public void setTotale(double totale) {
		this.totale = totale;
	}
	
	public void effettuaPagamento(Pagamento p){
		p.riepilogo(totale);
		p.paga(totale);
	}
}
