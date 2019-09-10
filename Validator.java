package javaassignment2;

import java.util.HashMap;

public class Validator {
	static HashMap<String, Integer> alphabets = new HashMap<String, Integer>();
	static public void initializeHashMap() {
		/* hash map of all alphabets as keys and their counts as values */
		alphabets.put("a", 0);
		alphabets.put("b", 0);
		alphabets.put("c", 0);
		alphabets.put("d", 0);
		alphabets.put("l", 0);
		alphabets.put("t", 0);
		alphabets.put("e", 0);
		alphabets.put("m", 0);
		alphabets.put("u", 0);
		alphabets.put("f", 0);
		alphabets.put("n", 0);
		alphabets.put("v", 0);
		alphabets.put("g", 0);
		alphabets.put("o", 0);
		alphabets.put("w", 0);
		alphabets.put("h", 0);
		alphabets.put("p", 0);
		alphabets.put("x", 0);
		alphabets.put("i", 0);
		alphabets.put("q", 0);
		alphabets.put("y", 0);
		alphabets.put("j", 0);
		alphabets.put("r", 0);
		alphabets.put("z", 0);
		alphabets.put("k", 0);
		alphabets.put("s", 0);
	}
	
	static public boolean isContainsAllAlpabets(String inputString) {	
		initializeHashMap();
		int sum = 0;
		/*
		 * this for loop iterates through every character in input string and checks if
		 * it is an alphabet or not if it is an alphabet it changes its value to one
		 */
		for (int i = 0; i < inputString.length(); i++) {
			String alphabet = inputString.substring(i, i + 1).toLowerCase();
			if (alphabets.containsKey(alphabet)) {
				if (alphabets.get(alphabet) == 0) {
					alphabets.put(alphabet, 1);
				}
			}
		}
		/* check the sum of all the values in hashmap */
		for (Integer values : alphabets.values()) {
			sum += values;
		}
		if (sum == 26) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isContainsAllAlpabets("abcdefghijklmnopqrstuvwxyz"));
		System.out.println(isContainsAllAlpabets("abcdefghijklmnopqrstuvwxy"));
	}
}
