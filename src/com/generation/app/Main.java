package com.generation.app;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		String riga = new String();
		Scanner file = new Scanner(new File("res/numeri.txt")); 
		while(file.hasNextLine()) {
			String temp = file.nextLine();
			if(temp.charAt(0) == ',') {
				temp = temp.substring(1);
			}
			if(temp.charAt(temp.length() - 1)!=',') {
				temp += ",";
			}
			riga += temp;	
		}
		riga = riga.substring(0, riga.length() - 1);
		file.close();
		
		String[] stringedDataArray = riga.split(",");
		int[] dataArray = new int[stringedDataArray.length];
		for (int i = 0; i < dataArray.length; i++) {
			dataArray[i] = Integer.parseInt(stringedDataArray[i]);
		}

		for (int num : dataArray) {
			System.out.println(num);
		}	

	}

}
