package com.naven.view;

import java.util.Scanner;
public class Menu {
	
	public static Scanner scanner;
	
	public Menu(Scanner scanner) {
		Menu.scanner = scanner;
	}

	public void mainLoopMenu() {
		printMainMenu();
		String menuOption = scanner.next();
		
		MenuController.eleccionMenu(menuOption);
		
	}

	private void printMainMenu() {
		System.out.println("Welcome to Naven Password Services");
		System.out.println();
		System.out.println("1. Password Generator");
		System.out.println("2. Password Check");
		System.out.println("3. Useful Information for Password");
		System.out.println("4. Quit");
		System.out.print("Choise: ");
	}
	
	
}
