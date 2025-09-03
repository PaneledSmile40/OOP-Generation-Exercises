package com.generation.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Decodificatore {
	private List<String> cifrarioList;
	private String[] cifrario;
	public Decodificatore(String[] cifrario){
		this.cifrario = cifrario;
		
		this.cifrarioList = new ArrayList<String>();
		for(int i=0; i < cifrario.length; i++) {
			this.cifrarioList.add(cifrario[i]);
		}
	}

	public String[] getCifrario() {
		return cifrario;
	}

	public void setCifrario(String[] cifrario) {
		this.cifrario = cifrario;
	}

	@Override
	public String toString() {
		return "Decodificatore [cifrario: " + Arrays.toString(cifrario) + "]";
	}
	
	
	public String encrypt(String plainWord) {
		String ris="";
		String[] temp = plainWord.split("");
		
		for(int i=0; i < temp.length; i++) {
			if(temp[i].equals(" ")){
				ris+=" _";
			}else ris += cifrarioList.indexOf(temp[i].toUpperCase()) + "_";   
		}
		
		return ris;
	}
	
	public String dencrypt(String encryptedWord) {
		String ris="";
		String[] temp = encryptedWord.split("_");
		
		for(int i=0; i < temp.length; i++) {
			if(temp[i].equals(" ")){
				ris+=" ";
			}else ris += cifrarioList.get(Integer.parseInt(temp[i]));   
		}
		
		return ris;
	}
	
	
	
	
	
	
}
