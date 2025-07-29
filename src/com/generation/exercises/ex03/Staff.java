package com.generation.exercises.ex03;

public class Staff extends Person{
	private int anniDiLavoro;
	
	
	public Staff() {}
	public Staff(String nome, String cognome, int eta, String residenza, int anniDiLavoro) {
		super(nome,cognome,eta,residenza);
		setAnniDiLavoro(anniDiLavoro);
	}
	
	
	public String toString() {
		return super.toString() + ",\nAnzianità lavorativa: " + getAnniDiLavoro();
	}
	
	
	public int getAnniDiLavoro() {
		return anniDiLavoro;
	}
	
	public void setAnniDiLavoro(int anniDiLavoro) {
		this.anniDiLavoro = anniDiLavoro<0?null:anniDiLavoro;
	}
	
}
