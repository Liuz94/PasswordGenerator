package com.naven.models;

public class Alphabet {
	public static final String UpperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String LowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	public static final String Numbers = "1234567890";
	public static final String Symbols = "!@#$%^&*()-_=+\\/~?";
	
	private StringBuilder pool;
	
	public Alphabet(boolean upeerCaseIncluded,
			boolean owerCaseIncluded,
			boolean numbersIncluded,
			boolean symbolsIncluded) {
		pool = new StringBuilder();
		
		if(upeerCaseIncluded) {pool.append(UpperCaseLetters);};
		if(owerCaseIncluded) {pool.append(LowerCaseLetters);};
		if(numbersIncluded) {pool.append(Numbers);};
		if(symbolsIncluded) {pool.append(Symbols);};
	}

	public Alphabet() {
	}

	public String getAlphabet() {
		return pool.toString();
	}
	
}
