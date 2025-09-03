package com.generation.entity;

import java.time.LocalDate;

public class Persona {
	private int id;
	private String nome, cognome, cittaResidenza;
	private LocalDate dob;
	public Persona(int id, String nome, String cognome, LocalDate dob, String cittaResidenza ) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dob = dob;
		this.cittaResidenza = cittaResidenza;
	}
	
	public Persona(String[] datiPersona ) {
		super();
		this.id = Integer.parseInt(datiPersona[0]);
		this.nome = datiPersona[1];
		this.cognome = datiPersona[2];
		this.dob = LocalDate.parse(datiPersona[3]);
		this.cittaResidenza = datiPersona[4];
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCittaDiResidenza() {
		return cittaResidenza;
	}
	public void setCittaDiResidenza(String cittaDiResidenza) {
		this.cittaResidenza = cittaDiResidenza;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Persona [id: " + id + ", nome: " + nome + ", cognome: " + cognome + ", città di residenza: " + cittaResidenza + ", data di nascita: "
				+ dob + "]";
	}
	
	
}
