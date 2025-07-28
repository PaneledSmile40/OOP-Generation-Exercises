package com.generation.exercises.ex02;

public class ForeingEmployee extends Employee {
	
	protected String nativeLanguage;
	
	public ForeingEmployee(String name, String surname, String dateofbirth, String gender,String job, int salary, String nativeLanguage){
		super(name,surname,dateofbirth,gender,job,salary);
		this.nativeLanguage=nativeLanguage;
	}

	
	
	public String toString() {
		return (super.toString() +" "+ getNativeLanguage());
	}
	
	
	@Override
	public int salary(int numMesi) {
		return super.salary(numMesi) + (int)(super.salary(numMesi)*5/100);
	}
	
	
	public String getNativeLanguage() {
		return nativeLanguage;
	}

	public void setNativeLanguage(String nativeLanguage) {
		this.nativeLanguage = nativeLanguage;
	}
	
	//Dispone di un nome perché lo eredità da Person tramite Employee
	//Dispone di un salario perché lo eredita da Employee
	//Appartiene a 3 tipi: Object, Person, Employee e ForeignEmployee
	
	
	
	
	
}