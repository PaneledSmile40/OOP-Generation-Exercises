package com.asyncLessons;

import com.generation.library.Console;

public class Ex01 {

	public static void main(String[] args) {
		int num1,num2,somma;

		Console.print("Dammi 2 numeri, te ne restituirò la media e la somma");
		Console.print("Primo numero:");
		num1 = Console.readInt();
		Console.print("Secondo numero:");
		num2 = Console.readInt();

		Console.print("La somma dei due numeri è: "+(somma=num1+num2)+"\nLa media dei due numeri è: "+(somma/2.0));
	}

}