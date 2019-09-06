package edu.seminolestate.textanalyzer;

public class TextAnalyzer {
	private StringBuilder textBlock;
	
	public static final int ADD_TO_FRONT = 1;
	public static final int ADD_TO_BACK = 2;
	public static final String DEFAULT_TEXT_BLOCK = "No User Text Available";
	
	public TextAnalyzer(String newText) {
		setTextBlock(newText);
	}
	
	public String getTextBlock() {
		return textBlock.toString();
	}
	
	public 

}
