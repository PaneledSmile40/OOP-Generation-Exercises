package com.generation.exercises;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire numero da cui cominciare il conto alla rovescia");
		int c=sc.nextInt();
		sc.close();
		int i=c;
		
		while (c>=0) {
			System.out.println(c);
			c--;
		}
		
		for(;i>=0;i--) {
			System.out.println(i);
		}
	}
}

