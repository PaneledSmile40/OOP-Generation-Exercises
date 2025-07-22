package com.generation.exercises;

public class UnitConverter {

	//Unita di distanza
	public static double metersToKmeters(double n) {
		return n/1000;
	}

	
	public static double kmetersToMeters(double n) {
		return n*1000;
	}

	
	public static double milesToMeters(double n) {
		return n*1609.34;
	}

	
	public static double metersToMiles(double n) {
		return n/1609.34;
	}

	
	//Unità di peso
	public static double gramsToKgrams(double n) {
		return n/1000;
	}

	
	public static double kgramsToGramskgrams(double n) {
		return n*1000;
	}

	
	public static double kgramsToLbs(double n) {
		return n*2.20462;
	}

	
	public static double lbsToKgrams(double n) {
		return n/2.20462;
	}
	
	
	//Unità di temperatura
	public static double celsiusToFahrenheit(double n) {
		return (n*9/5)+32;
	}

	
	public static double fahrenheitToCelsius(double n) {
		return (n-32)/9*5;
	}

	
	public static double celsiusToKelvin(double n) {
		return n+273.15;
	}

	
	public static double kelvinToCelsius(double n) {
		return n-273.15;
	}
	
	
	//Unità di volume
	public static double litersToMilliliters(double n) {
		return n*1000;
	}

	
	public static double millilitersToLiters(double n) {
		return n/1000;
	}

	
	public static double litersToGallons(double n) {
		return n/0.264172;
	}

	
	public static double gallonsToLiters(double n) {
		return n*0.264172;
	}
	
	
}
