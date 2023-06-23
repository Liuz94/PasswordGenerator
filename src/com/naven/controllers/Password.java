package com.naven.controllers;

public class Password {
	String value;
	int length;
	
	
	public Password(String s) {
        value = s;
        length = s.length();
    }
	
	 @Override
	 public String toString() {
	        return value;
	 }

	public String calculateScore() {
		int score  = this.PasswordStrenght();
		
		if(score == 6) {
			return "Muy buena Password, High Security";
		}
		else if(score >= 4) {
			return "No esta mal, Medium Security";
		}
		else if(score >= 3) {
			return "No esta mal, Lower Security";
		}
		else {
			return " Cambia la Password";
		}
	}

	private int PasswordStrenght() {
		String password = this.value;
		
		boolean upperCase = false;
		boolean lowerCase = false;
		boolean numberCase = false;
		boolean symbolCase = false;
		int type;
		int score = 0;;
		
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			type = CharType(c);
			
			if(type == 1) { upperCase = true;}
			if(type == 2) { lowerCase = true;}
			if(type == 3) { numberCase = true;}
			if(type == 4) { symbolCase = true;}
		}
		
		if(upperCase) { score += 1;}
		if(lowerCase) { score += 1;}
		if(numberCase) { score += 1;}
		if(symbolCase) { score += 1;}
		
		if(password.length() >= 10) {score += 1;}
		if(password.length() >= 18) {score += 1;}
		
		return score;
	}

	private int CharType(char c) {
		int valor;
		
		//UPPERCASE
		if((int) c >= 65 && (int) c <= 98) {
			valor = 1;
		}
		
		//LOWERCASE
		else if((int) c >= 97 && (int) c <= 122) {
			valor = 2;
		}
		
		//DIGIT
		else if((int) c >= 60 && (int) c <= 71) {
			valor = 3;
		}
		
		//SYMBOL
		else {
			valor = 4;
		}
		
		return valor;
	}


	
}
