package com.generation.entity;

import com.generation.interfaces.Pagamento;

public class BonificoBancario implements Pagamento{

	@Override
	public void paga(double importo) {
		if (Pagamento.validaImporto(importo)) {
			System.out.println("Pagamento di " + importo + "€ effettuato con " + getMetodo());
		}else System.out.println("Importo invalido, pagamento annullato");
		
	}

	@Override
	public String getMetodo() {
		return "bonifico bancario";
	}
	
}
