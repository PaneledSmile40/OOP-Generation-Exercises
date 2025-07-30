package com.generation.exercises.ex04;

public class ContoCorrente {
	
	private double balance;
	private String history;
	private final int pin; //final
	
	public ContoCorrente(double balance, int pin) {
		if(balance<0)balance=0.0;
		setBalance(balance);
		setHistory("Apertura conto \nSaldo iniziale: " + getBalance() +"€");
		this.pin = pin;
	}
	
	public void withdraw(double sum) {
		if(sum == 0) {
			System.out.println("0 è invalido, operazione annullata");
			return;
		}
		if(sum > getBalance()) {
			System.out.println("Stai cercando di prelevare una somma superiore a quella disponibile, operazione annullata");
			return;
		}
		double newBalance = getBalance()-sum;
		setBalance(newBalance);
		sum  = -sum;
		String newHistory = getHistory() + addOperation(sum);
		setHistory(newHistory);
		System.out.println("Importo ritirato con successo");
	}
	
	public void deposit(double sum) {
		if(sum == 0) {
			System.out.println("0 è invalido, operazione annullata");
			return;
		}
		if(sum < 0) {
			System.out.println("Stai cercando di depositare una somma negativa, operazione annullata");
			return;
		}
		double newBalance = getBalance()+sum;
		setBalance(newBalance);
		String newHistory = getHistory() + addOperation(sum);
		setHistory(newHistory);
		System.out.println("Importo depositato con successo");
	}
	
	
	public String addOperation(double sum) {
		return sum > 0 ? "\nDeposito " + sum + "€, nuovo totale "+ getBalance() +"€" : "\nPrelievo " + sum + "€, nuovo totale "+ getBalance() +"€";
	}
	
	
	
	@Override
	public String toString() {
		return ("Conto Corrente\n" + "Saldo: " + getBalance() +  "\nPin: "+ getPin() + "\nStorico:\n" + getHistory());
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance) {
		//balance < 0.0  ? System.out.println("") : this.balance = balance;
		if(balance<0.0) {
			System.out.println("Operazione non valida");
			return;
		}
		this.balance = balance;
	}
	
	public String getHistory() {
		return history;
	}
	
	public void setHistory(String history) {
		this.history = history;
	}
	
	public int getPin() {
		return pin;
	}
	
	
	
	
	
	

}
