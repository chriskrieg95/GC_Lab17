package co.grandcircus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile {

	/*
	 * Helper methods for CountriesApp    India (pop 1,339,000,000)
	 */
	public static void readFromFile() {

		String fileName = "countries.txt";
		Path path = Paths.get("countries", fileName);

		File file = path.toFile();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String line = br.readLine();
			while (line != null) {
				String[] country = line.split(",");
				System.out.printf("%s%s%,d%s\n", country[0], " (pop ", Integer.parseInt(country[1]), ")");
				line = br.readLine();
			}

			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Something went wrong with the file");
		} catch (IOException e) {
			System.out.println("Something went wrong when we tried to read from the file");
		}

	}
	
	public static void writeToFile(Country c) {

		String fileName = "countries.txt";
		Path path = Paths.get("countries", fileName);

		File file = path.toFile();
		PrintWriter output = null;
		try {
			output = new PrintWriter(new FileOutputStream(file, true));
			output.println(c);
			output.close();
		} catch (FileNotFoundException e) {
			System.out.println("Hey, contact customer service!");
		} finally {
			output.close();
		}
	}
	
	public static void createOurFile() {

		String fileName = "countries.txt";
		Path path = Paths.get(fileName);

		if (Files.notExists(path)) {
			try {
				Files.createFile(path);
				System.out.println("The file was created successfully");
			} catch (IOException e) {
				System.out.println("Something went terribly wrong!");
			}
		} else {
			System.out.println("The file already exists!");
		}

	}
	
	public static void createDir() {
		String dirPath = "countries";
		Path folder = Paths.get(dirPath);

		if (Files.notExists(folder)) {
			try {
				
				Files.createDirectories(folder);
				System.out.println("The file was created successfully!");
				
			} catch (IOException e) {
				
				System.out.println("Something went wrong with the folder creation");
				
			}
		} else {
			
			System.out.println("The folder already exists!");
			
		}

	}
	
}
