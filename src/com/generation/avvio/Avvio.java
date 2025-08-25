package com.generation.avvio;

import com.generation.entity.Ordine;
import com.generation.entity.PayPal;
import com.generation.entity.BonificoBancario;
import com.generation.entity.CartaDiCredito;
import com.generation.entity.Criptovaluta;


public class Avvio {

	public static void main(String[] args) {
		Ordine ordine1 = new Ordine(50);
		Ordine ordine2 = new Ordine(27);
		Ordine ordine3 = new Ordine(19);
		Ordine ordine4 = new Ordine(-48);
		
		ordine1.effettuaPagamento(new CartaDiCredito());
		ordine2.effettuaPagamento(new PayPal());
		ordine3.effettuaPagamento(new BonificoBancario());
		ordine4.effettuaPagamento(new Criptovaluta());
	}

}
