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
	
	public void setTextBlock(String newText) {
		if(newText != null) {
			textBlock = new StringBuilder(newText);
		}
	}
	
	public int getNumberOfWords() {
		String[] words = textBlock.toString().split("\\s+");
		return words.length;
		
	}
	
	public int getNumberOfVowels() {
		String str = textBlock.toString();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if (Character.toUpperCase(str.charAt(i)) == 'A' ||
				Character.toUpperCase(str.charAt(i)) == 'E' ||
				Character.toUpperCase(str.charAt(i)) == 'I' ||
				Character.toUpperCase(str.charAt(i)) == 'O' ||
				Character.toUpperCase(str.charAt(i)) == 'U'){
                
				count++;
                
            }
        }
		
        return count;
    }
	
	public int getNumberOfConsonants() {
		String str = textBlock.toString();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if (!(Character.toUpperCase(str.charAt(i)) == 'A' ||
				Character.toUpperCase(str.charAt(i)) == 'E' ||
				Character.toUpperCase(str.charAt(i)) == 'I' ||
				Character.toUpperCase(str.charAt(i)) == 'O' ||
				Character.toUpperCase(str.charAt(i)) == 'U' ||
				str.charAt(i) == ' ')){
                
				count++;
                
            }
        }
		
        return count;
    }
	
	public String addSubString(String addedText, int frontOrBack) {
		if(frontOrBack == ADD_TO_FRONT) {
			textBlock = textBlock.insert(0, addedText);
		}
		
		if(frontOrBack == ADD_TO_BACK) {
			textBlock = textBlock.append(addedText);
		}
		
		return textBlock.toString();
	}

}
