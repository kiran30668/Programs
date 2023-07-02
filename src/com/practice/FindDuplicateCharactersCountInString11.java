package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharactersCountInString11 {

	public static void main(String[] args) {
		
		String str="Saikiran Karur";
		
		//String lowerCase = str.toLowerCase();
		char[] charArray = str.toCharArray();  //S a i k i r a n K a r u r
		
		
		Map<Character,Integer> charMap=new HashMap<>();
		
		// logic --> Characters are inserted as Keys and the respective count inserted as values
		// If map already contains the character then increase the value by 1.
		// (a,3),(i,2),(k,2),(r,3),
		
		for(Character ch:charArray) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);  
			}
		}
		
		//Loop through only keys
		Set<Character> keys = charMap.keySet();
		
		for (Character ch : keys) {
			if(charMap.get(ch) > 1) {
				System.out.println("Character "+ch+" repeating "+charMap.get(ch)+" times.");
			}
		}
		
		
	}

}
