package com.generation.entity;

import com.generation.contract.Render;

public class RenderDestinationYear implements Render {

	@Override
	public String render(Viaggio v) {
		// TODO Auto-generated method stub
		return "Viaggio [destinazione=" + v.getDestinazione() + ", anno=" + v.getAnno() + "]";
	}

}
