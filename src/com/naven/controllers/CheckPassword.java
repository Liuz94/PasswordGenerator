package com.naven.controllers;

import java.util.Scanner;

import main.iniciar;

public class CheckPassword {

	public static Scanner scanner;

	public CheckPassword(Scanner scanner) {
		CheckPassword.scanner = scanner;
	}

	public static void checkPassword() {
		String input;

		System.out.println("Enter Your Password: ");
		input = scanner.next();

		Password password = new Password(input);

		System.out.println(password.calculateScore());
		iniciar.main(null);
	}

}
