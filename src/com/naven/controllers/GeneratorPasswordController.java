package com.naven.controllers;

import java.util.Scanner;

import main.iniciar;

public class GeneratorPasswordController {
	public static Scanner scanner;
	
	public GeneratorPasswordController(Scanner scanner) {
		GeneratorPasswordController.scanner = scanner;
	}
	
	private static boolean parametrosCorrectos = false;

	public static void passwordGenerator() {
		Boolean upperCaseBoolean = false;
		Boolean lowerCaseBoolean = false;
		Boolean numberBoolean = false;
		Boolean symbolsBoolean = false;
		
		String input;
			System.out.println("Please answer the following questions by Y/N: ");
			
			do {
				//////UPPER CASE/////////
				do {
					System.out.println("Do you want UpperCase Letters /A,B,C,D.../ to be used? ");
					input = scanner.next();
					PasswordQuestionsError(input);
				} while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N"));
				
				if(esIncluida(input)) {
					upperCaseBoolean = true;
				}
				
				//////LOWER CASE////////
				do {
					System.out.println("Do you want LowerCase Letters /a,b,c,d.../ to be used? ");
					input = scanner.next();
					PasswordQuestionsError(input);
				} while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N"));
				
				if(esIncluida(input)) {
					lowerCaseBoolean = true;
				}
				
				
				//////NUMBER CASE////////
				do {
					System.out.println("Do you want Numbers /1,2,3,4.../ to be used? ");
					input = scanner.next();
					PasswordQuestionsError(input);
				} while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N"));
				
				if(esIncluida(input)) {
					numberBoolean = true;
				}
				
				///////Symbols CASE////////
				do {
					System.out.println("Do you want Symbols /!,@,#,$.../ to be used? ");
					input = scanner.next();
					PasswordQuestionsError(input);
				} while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N"));
				
				if(esIncluida(input)) {
					symbolsBoolean = true;
				}
				
				if(!upperCaseBoolean && !lowerCaseBoolean && !numberBoolean && !symbolsBoolean) {
					System.out.println("You haven't characters to generate your password");
					parametrosCorrectos  = true;
				}
			} while (parametrosCorrectos);
			
			System.out.println("Genial, Selecciona la longitud de caracteres que quieres!: ");
			
			int longitudCaractereds = scanner.nextInt();
			Generador generador = new Generador(upperCaseBoolean, lowerCaseBoolean, numberBoolean, symbolsBoolean);
			Password password = generador.GeneratedPassword(longitudCaractereds);
			
			System.out.println( "Your PassWord is = " + "//// " + password);
			iniciar.main(null);
	}

	private static boolean esIncluida(String input) {
		if(input.equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}

	private static void PasswordQuestionsError(String input) {
		if(!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
			System.out.println("You have enterred something incorrect");
		}
	}
	
}
