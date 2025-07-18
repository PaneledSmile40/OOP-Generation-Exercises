package com.generation.exercises;

public class Ex03 {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 4;
		int num3 = 2;

		if (num1 > num2) {
			num1 += num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
		}
		if (num1 > num3) {
			num1 += num3;
			num3 = num1 - num3;
			num1 = num1 - num3;
		}
		if (num2 > num3) {
			num2 += num3;
			num3 = num2 - num3;
			num2 = num2 - num3;
		}

		System.out.print("Numeri ordinati\n" + num1 + "\n" + num2 + "\n" + num3);
	}

}
