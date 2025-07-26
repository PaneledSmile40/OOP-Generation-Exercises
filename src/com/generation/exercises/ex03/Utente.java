package com.generation.exercises.ex03;

public class Utente {

	private String username,password;
	
	public Utente(){}
	public Utente(String username, String password) {
		setUsername(username);
		setPassword(password);
	}
	
	
	public String toString() {
		return ("Nome Utente: " + getUsername() + "\nPassword: " + getPassword());
	}
	
	
	public boolean checkUser(String username) {
		return (this.username.equals(username));
		
	}
	
	
	public boolean checkPassword(String password) {
		return (this.password.equals(password));
	}
	
	
	public boolean check(String username, String password) {
		return (checkUser(username) && checkPassword(password)); 	
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}