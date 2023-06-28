package com.Practice;

import java.util.HashMap;

public class NoRepeat {

	public static void main(String[] args) {
		String str = "11223345566";
		HashMap<Character,Integer> hmap = new HashMap<Character, Integer>();
		
		int lengthOfString = str.length();
		
		for(int i=0;i<lengthOfString;i++) {
			Character currntCharacter = str.charAt(i);
			if(hmap.containsKey(currntCharacter)==false) {
				hmap.put(currntCharacter, 1);
				
			}else {
				int currentFreq = hmap.get(currntCharacter);
				currentFreq++;
				hmap.put(currntCharacter, currentFreq);
				
			}
		}

		
		boolean noRepeatingFound = false;
		
	}

}
