package com.generation.app;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner file = new Scanner(new File("res/numeri.txt")); 
		String[] stringedDataArray = file.nextLine().split(",");
		file.close();
		
		int[] dataArray = new int[stringedDataArray.length];
		
		for(int i=0; i<dataArray.length;i++) {
			dataArray[i] = Integer.parseInt(stringedDataArray[i]);
		}
		
		for(int num:dataArray) {
			System.out.println(num);
		}
		
		
		
	}

}
