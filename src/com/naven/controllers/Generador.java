package com.naven.controllers;

import com.naven.models.Alphabet;

public class Generador {
	
	Alphabet alphabet;

	public Generador(Boolean upperCaseBoolean, Boolean lowerCaseBoolean, Boolean numberBoolean,
			Boolean symbolsBoolean) {
		alphabet = new Alphabet(upperCaseBoolean, lowerCaseBoolean, numberBoolean, symbolsBoolean);
	}

	public Password GeneratedPassword(int longitudCaractereds) {
		StringBuilder password = new StringBuilder("");
		int alphabetLegth = alphabet.getAlphabet().length();
		
		int max = alphabetLegth - 1;
		int min = 0;
		int range = max - min + 1; 
		System.out.println("Generando Password // Caracteres " + longitudCaractereds);
		
		for (int i = 0; i < longitudCaractereds; i++) {
			int index = (int) (Math.random() * range) + min;
			password.append(alphabet.getAlphabet().charAt(index));
		}
		
		return new Password(password.toString());
	}
	
}
