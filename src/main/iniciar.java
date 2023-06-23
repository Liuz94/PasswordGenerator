package main;

import java.util.Scanner;

import com.naven.controllers.CheckPassword;
import com.naven.controllers.GeneratorPasswordController;
import com.naven.view.Menu;

public class iniciar {

	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Menu menu = new Menu(scanner);
		new GeneratorPasswordController(scanner);
		new CheckPassword(scanner);
		menu.mainLoopMenu();
		scanner.close();
	}
	
}
