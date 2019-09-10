package edu.seminolestate.textanalyzer;
import java.util.Scanner;

public class TextAnalyzerApplication {
	
	public static void displayMenu() {
		System.out.println("1 - Create the text\n"
				+ "2 - Change the existing text\n"
				+ "3 - Display statistics for existing text\n"
				+ "4 - Add new text to existing text\n"
				+ "5 - Display existing text\n"
				+ "6 - Exit");
	}
	
	public static void main(String[] args) {
		displayMenu();
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number == 1) {
			System.out.println("Enter the new text for the TextAnalyzer object:");
			String text = sc.next();
			TextAnalyzer textAnalyzer = new TextAnalyzer(text);
			displayMenu();
		}
		
	}
}
