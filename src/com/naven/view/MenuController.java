package com.naven.view;

import com.naven.controllers.CheckPassword;
import com.naven.controllers.GeneratorPasswordController;

public class MenuController {

	public static void eleccionMenu(String menuOption) {
		
		switch (menuOption) {
		case "1" -> {
			System.out.println("You have selected the option 1: PASSWORD GENERATED");
			GeneratorPasswordController.passwordGenerator();
		}
		case "2" ->{
			System.out.println("You have selected the option 2: PASSWORD CHECK");
			CheckPassword.checkPassword();
		}
		case "3" -> {
			System.out.println("You have selected the option 2: USEFUL INFORMATION FOR PASSWORD");
			PrintUsefulInfor.printinformation();
		}
		case "4" -> {
			System.out.println("QUIT");
			PrintExit.exitMessage();
			System.exit(0);
		}
		default -> {
			throw new IllegalArgumentException("Unexpected value: " + menuOption);
			}
		}
	}


}
