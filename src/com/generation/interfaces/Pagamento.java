package com.generation.interfaces;

public interface Pagamento {
	abstract void paga(double importo);
	
	
	abstract String getMetodo();
	
	
	default void riepilogo(double importo) {
		System.out.println("Hai scelto " + getMetodo() + " per pagare "+ importo + "€"); 
	}
	
	
	static  boolean validaImporto(double importo) {
		return importo > 0 ? true : false;
	}
}
