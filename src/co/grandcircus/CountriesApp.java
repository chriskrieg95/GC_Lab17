package co.grandcircus;

import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String name = "";
		int population = 0;
		int action = 0;
		do {
			System.out.println("\nWelcome to the Countries Maintenance Application!");
			System.out.println("1 - See the list of countries\n2 - Add a country\n3 – Exit\n");
			action = Validator.getInt(scnr, "Enter menu number: ", 1, 3);
			switch(action) {
				
			case 1:
				CountriesTextFile.readFromFile();
				break;
			case 2:
				name = Validator.getString(scnr, "Enter country: ");
				population = Validator.getInt(scnr, "Enter population: ");
				Country c = new Country(name, population);
				CountriesTextFile.writeToFile(c);
				System.out.println("This country has been saved!");
				break;
			default:
				break;
			}
		} while (action != 3);

		//This is our indication that the program has ended
		System.out.println("Goodbye!");
		
		scnr.close();
	}

}
