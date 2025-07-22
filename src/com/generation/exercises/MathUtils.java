package com.generation.exercises;

public class MathUtils {

		public static int max(int a, int b) {
			return a > b?  a :  b;
		}
	
		
		public static int min(int a, int b) {
			return a > b?  b :  a;
		}
		
		public static double max(double a, double b) {
			return a > b?  a :  b;
		}
	
		
		public static double min(double a, double b) {
			return a > b?  b :  a;
		}
		
		
		public static boolean isPrime(int num) {
			if (num <= 1) return false;
			if (num % 2 == 0) return false;
			if (num % 3 == 0) return false;
			//17 
			for (int i=5; i <= Math.sqrt(num) ;i++) {
					if(i % 2 == 0 || i % 3 == 0) {
						continue;
					}else if (num % i == 0) return false;
			}
			
			return true;
		}
		
		
		public static boolean isInRange(int n, int min, int max){
			return n>=min && n<=max ? true : false;
		}

		
		public static boolean isInRange(double n, double min, double max){
			return n>=min && n<=max ? true : false;
		}
		
		
		public static double onlyTwoDecimals(double n) {
			return Math.round(n * 100.0) / 100.0;
		}
		
}

