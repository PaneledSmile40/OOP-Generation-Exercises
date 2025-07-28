package com.generation.exercises.ex02;

public class Consultat extends Person{
	protected boolean piva;
	protected String sector;
	
	public Consultat(String name, String surname, String dateofbirth, String gender, boolean piva,String sector) {
		super(name,surname,dateofbirth,gender);
		setPiva(piva);
		setSector(sector);
	}
	
	@Override 
	public String toString() {
		return super.toString()+"\npiva: "+(isPiva()?"si":"no") +"\nsettore: ";
	}

	public boolean isPiva() {
		return piva;
	}

	public void setPiva(boolean piva) {
		this.piva = piva;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
	
	
	
	
}	
