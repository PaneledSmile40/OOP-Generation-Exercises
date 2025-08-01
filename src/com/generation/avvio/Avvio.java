package com.generation.avvio;

import com.generation.entities.ODcreator;
import com.generation.interfaces.ODinterface;
import com.generation.entities.Q;
import com.generation.entities.OD;

public class Avvio {

	public static void main(String[] args) {
		ODinterface opera01 = ODcreator.crea("quadro");
		((Q)opera01).setEsposta(false);
		opera01.stampaOpera(((OD)opera01).toString());
		

	}

}
