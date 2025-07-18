package com.generation.exercises;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c;
		
		do {
		System.out.println("Dammi un numero positivo");
		c = sc.nextInt();
		}while(c<0);
		
		sc.close();
	}

}
