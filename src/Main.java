/**
 * Quick CTL parser
 * Author       : Étienne André
 * Created      : 2024/10/08
 * Last modified: 2024/10/15
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        // Check if a file path is provided as a command-line argument
        if (args.length == 0) {
            System.out.println("Usage: java Main <file_path>");
            return;
        }

        // The file path is passed as the first argument
        String file_name = args[0];

        // Read the formula from the file
		try{
			Formula formula = CTLParser.parseFormula(file_name);
			System.out.println("Parsed formula: " + formula);
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file_name);
		} catch (ParseException e) {
			System.out.println("Error parsing the CTL formula: " + e.getMessage());
		}
    }
}
