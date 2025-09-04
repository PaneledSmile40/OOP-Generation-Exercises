package com.generation.contract;

import java.util.List;


import com.generation.entity.Viaggio;

public interface Render {
	String render(Viaggio v);
	
	default String renderAll(List<Viaggio> lista) {
		String ris=""; 
		for (Viaggio v : lista) {
			ris += render(v);
		}
		return ris;
	}
}
