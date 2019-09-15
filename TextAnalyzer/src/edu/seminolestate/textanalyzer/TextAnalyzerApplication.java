//Mamoon Ulhaq 9/15/19

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
		TextAnalyzer textAnalyzer = null;
		while (true) {
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			
			if(number == 1) {
				System.out.println("Enter the new text for the TextAnalyzer object:");
				String text = sc.next();
				textAnalyzer = new TextAnalyzer(text);
				displayMenu();
			}
			if(number == 2) {
				if(textAnalyzer != null) {
					System.out.println("Enter the new text for the TextAnalyzer object:");
					String text = sc.next();
					textAnalyzer.setTextBlock(text);
					displayMenu();
				}
				else {
					System.out.println("Error: Text not created");
					displayMenu();
				}
			}
			if(number == 3) {
				if(textAnalyzer != null) {
					System.out.println("Number of consonants: " + textAnalyzer.getNumberOfConsonants());
					System.out.println("Number of vowels: " + textAnalyzer.getNumberOfVowels());
					System.out.println("Number of words: " + textAnalyzer.getNumberOfWords());
					displayMenu();
				}
				else {
					System.out.println("Error: Text not created");
					displayMenu();
				}
			}
			if(number == 4) {
				if(textAnalyzer != null) {
					System.out.println("Enter the new text");
					String text = sc.next();
					System.out.println("Press 1 to add to front, 2 to add to back");
					int frontOrBack = sc.nextInt();
					textAnalyzer.addSubString(text, frontOrBack);
					displayMenu();
				}
				else {
					System.out.println("Error: Text not created");
					displayMenu();
				}

			}
			if(number == 5) {
				if(textAnalyzer != null) {
					System.out.println(textAnalyzer.getTextBlock());
					displayMenu();
				}
				else {
					System.out.println("Error: Text not created");
					displayMenu();
				}
			}
			if(number == 6) {
				System.out.println("Thanks for using textAnalyzer!");
				System.exit(0);
			}
			
		}
		
	}
}
