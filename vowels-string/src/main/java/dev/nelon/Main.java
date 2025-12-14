package dev.nelon;

public class Main {
	public static void main(String[] args) {
		String text = "Hello World";
		System.out.println(vowelsString(text));
	}
	
	public static StringBuilder vowelsString(String text) {
		String vowels = "aeiouAEIOU";
		StringBuilder vowelsInText = new StringBuilder();
		
		for (int i = 0; i < text.length(); i++) {
			if (vowels.indexOf(text.charAt(i)) != -1) {
				vowelsInText.append(text.charAt(i));
			}
		}
		
		return vowelsInText;
	}
}