package com.generation.exercises.ex02;

public class Person {
	protected String name, surname, dateofbirth, gender;

	public Person(String name, String surname, String dateofbirth, String gender) {
		this.name = name;
		this.surname = surname;
		this.dateofbirth = dateofbirth;
		this.gender = gender;

	}
	
	
	

	@Override
	public String toString() {
		return "Person \nname: " + getName() + ",\nsurname: " + getSurname() + ",\ndateofbirth: " + getDateofbirth() + ",\ngender: " + getGender();
	}




	public String getName() {
		return name != null ? name : "UNKNOWN";
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public String getSurname() {
		return surname != null ? surname : "UNKNOWN";
	}

	public void setSurname(String surname) {
		if (surname != null) {
			this.surname = surname;
		}
	}

	public String getDateofbirth() {
		return dateofbirth != null ? dateofbirth : "UNKNOWN";
	}

	public void setDateofbirth(String dateofbirth) {
		if (dateofbirth != null) {
			this.dateofbirth = dateofbirth;
		}
	}

	public String getGender() {
		return gender != null ? gender : "UNKNOWN";
	}

	public void setGender(String gender) {
		if (gender != null) {
			this.gender = gender;
		}
	}
}