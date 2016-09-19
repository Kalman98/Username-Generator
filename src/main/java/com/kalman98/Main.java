package com.kalman98;
import java.util.Random;

public class Main {

	final static char[] CONSONANTS = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
	final static char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
	
	static int length;
	static Random rand = new Random();
	static String username = "";
	static boolean isConsonant = false;
	
	public static void main(String[] args) {
		
		for (int j = 0; j < 10; j ++) {
			length = Integer.parseInt(args[0]);
			username = "";
			
		if (rand.nextInt(2) == 0)
			isConsonant = true;
		
		for (int i = 0; i < length - 1; i ++) {
			if (isConsonant) addConsonants();
			else addVowels();
			
			isConsonant = !isConsonant;
		}
		if (rand.nextInt(2) + 1 == 2) username = username.substring(0, 1).toUpperCase() + username.substring(1);
		if (rand.nextInt(5) + 1 == 5) username = username + (rand.nextInt(999) + 1);
		System.out.println(username);
		}
	}
	
	
	public static void addConsonants() {
		char letter = CONSONANTS[rand.nextInt(CONSONANTS.length)];
		
		if (rand.nextInt(8) + 1 == 8) {username = username + letter + letter; length -= 1;}
		else username = username + letter;
	}

	public static void addVowels() {
		char letter = VOWELS[rand.nextInt(VOWELS.length)];
		
		if (rand.nextInt(8) + 1 == 8) {username = username + letter + letter; length -= 1;}
		else username = username + letter;
	}
}
