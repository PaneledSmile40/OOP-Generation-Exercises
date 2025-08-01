package com.generation.entities;

import java.util.Objects;

import com.generation.interfaces.ODinterface;

public abstract class OD implements ODinterface{
	protected String titolo,artista;
	protected boolean esposta;
	
	public OD(){};
	public OD(String titolo, String artista, boolean esposta) {
		super();
		this.titolo = titolo;
		this.artista = artista;
		this.esposta = esposta;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		OD other = (OD) o;
		return Objects.equals(titolo, other.titolo) && Objects.equals(artista, other.artista);
	}
	
	
	public abstract double printIngombro();
	
	public void cambiaEsposizione() {
		setEsposta(!isEsposta());
	}
	

	@Override
	public String toString() {
		return "\ntitolo: " + titolo + "\nartista: " + artista + "\nesposta: " + esposta;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public boolean isEsposta() {
		return esposta;
	}
	public void setEsposta(boolean esposta) {
		this.esposta = esposta;
	}
	
	
}
