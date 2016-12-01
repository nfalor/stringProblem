package com.apple.StringReplace;

/*@author nfalor
 * Method to replace string with a given character
 */

public class StringReplace {
	
	public static String removeCharacter(String myStr, char charToRemove) {
		
		//Check for null
		if (myStr == null) return null;
		StringBuilder outputStr = new StringBuilder();
		
		//Iterate through string and check for character to remove
		for (char character : myStr.toCharArray()) {
			if (character!= charToRemove) {
				outputStr.append(character);
			}
		}
		
		//Return the output string
		return outputStr.toString();
	}

	public static String removeCharacterUsingApi(String str, char charToRemove) {
		
		//Check for null
		if (str == null) return null;
		
		//Use string api to replace character
		return str.replaceAll(String.valueOf(charToRemove), "");
	}
}

