package com.revature.eval.java.core;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j = 0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	// create new string
	// change to uppercase
	// split at space char
	// charAt(0) for each and push to new String
	// return new string
	public String acronym(String phrase) {

		String[] phraseSplit = phrase.split(" ");
		String acronym = "";

		for (int i = 0; i < phraseSplit.length; i++) {
			acronym += phraseSplit[i].charAt(0);
		}

		return acronym.toUpperCase();

	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			if (sideOne == sideTwo && sideOne == sideThree) {
				return true;
			} else {
				return false;
			}
		}

		public boolean isIsosceles() {
			if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
				return true;
			} else {
				return false;
			}
		}

		public boolean isScalene() {
			if (sideOne != sideTwo && sideOne != sideThree && sideTwo != sideThree) {
				return true;
			} else {
				return false;
			}
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	// switch case
	public int getScrabbleScore(String string) {

		int points = 0;
		char letter;
		char[] tokens = string.toUpperCase().toCharArray();

		for (char letters : tokens) {
			switch (letters) {

			case 'A':
				points += 1;
				break;

			case 'B':
				points += 3;
				break;

			case 'C':
				points += 3;
				break;

			case 'D':
				points += 2;
				break;

			case 'E':
				points += 1;
				break;

			case 'F':
				points += 4;
				break;

			case 'G':
				points += 2;
				break;

			case 'H':
				points += 4;
				break;

			case 'I':
				points += 1;
				break;

			case 'J':
				points += 8;
				break;

			case 'K':
				points += 5;
				break;

			case 'L':
				points += 1;
				break;

			case 'M':
				points += 3;
				break;

			case 'N':
				points += 1;
				break;

			case 'O':
				points += 1;
				break;

			case 'P':
				points += 3;
				break;

			case 'Q':
				points += 10;
				break;

			case 'R':
				points += 1;
				break;

			case 'S':
				points += 1;
				break;

			case 'T':
				points += 1;
				break;

			case 'U':
				points += 1;
				break;

			case 'V':
				points += 4;
				break;

			case 'W':
				points += 4;
				break;

			case 'X':
				points += 8;
				break;

			case 'Y':
				points += 4;
				break;

			case 'Z':
				points += 10;
				break;
			}
		}

		return points;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	// remove all non-digits
	// remove index 0 if no of digits is > 10
	// Character is a systems library
	// character.isDigit
	public String cleanPhoneNumber(String string) {
		String phoneNumber = "";
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				phoneNumber += Character.toString(string.charAt(i));
			}
		}

		if (phoneNumber.length() == 11)
			phoneNumber = phoneNumber.substring(1);
		if (phoneNumber.length() != 10)
			throw new IllegalArgumentException();
		return phoneNumber;
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	// split at space
	// create a hash map key/string and value/integer
	// loop over the words
	// search for that word in hash map, increment the counter
	// return the hash map
	public Map<String, Integer> wordCount(String string) {
		Map<String, Integer> wc = new HashMap<>();

		String[] phraseSplit = string.split(" ");

		for (int i = 0; i < phraseSplit.length; i++) {
			if (wc.containsKey(phraseSplit[i])) {
				// we saw the word earlier
				// retrieve the number of times we saw and increment and put it back
				Integer count = wc.get(phraseSplit[i]);
				wc.put(phraseSplit[i], count + 1);
			} else {
				// first time , we saw the word
				// initialize the number of times we saw the word to 1
				wc.put(phraseSplit[i], 1);
			}

		}

		return wc;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */

	static class BinarySearch<T> {
		private List<T> sortedList; 
		// T is the generic type
		
		// Comparable is an interface used to compare two elements of the same type, and will return if one is greater, equal to, or less the other

		public int indexOf(T t) {
			// t is an instance of type Comparable
			if (!(t instanceof Comparable)) {
				
				throw new IllegalArgumentException("Can't compare");
			}

			// @SuppressWarnings("unchecked")
			List<Comparable> list = (List<Comparable>) sortedList;
			// assigning the sorted list we 
			// type casting the List<T> to a List<Comparable> so we can compare elements in the list 
			Comparable item = (Comparable) t;

			// regular binary search code
			int l = 0;
			int r = list.size() - 1;

			while (l <= r) {

				int c = (l + r) / 2;
				int compare = item.compareTo(list.get(c));

				if (compare == 0) {
					return c;
				}

				if (compare < 0) {
					r = c - 1;
				} else {
					l = c + 1;
				}
			}

			return -1;

		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */

	static boolean isVowel(char c) {
		// checking if character is vowel
		return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
				|| c == 'u');
	}

	public String toPigLatin(String s) {
		String output = "";

		// enhanced for loop to iterate words given in string
		for (String word : s.split(" ")){
			// the index of the first vowel is stored
			if (output != "") {
				output += " "; // add space
			}
			int len = word.length();
			int index = -1; // initializing to -1 to see if vowel is present
			for (int i = 0; i < len; i++) // searching for vowel in string
			{
				if (isVowel(word.charAt(i))) {
					// Added a condition for the edge case
					if (word.charAt(i) == 'u' && word.charAt(i + 1) == 'i') {
						continue;
					}
					index = i;
					break;
				}
			}

			// is vowel present
			if (index == -1)
				return "-1";

			// Take all characters from index
			// append all characters which are before index
			// append "ay"
			output += word.substring(index) + word.substring(0, index) + "ay";
		}

		return output;
	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */

	public boolean isArmstrongNumber(int num) {

		String number = String.valueOf(num); // converting integer to String 
		char[] numDigits = number.toCharArray(); // creating char array to store numbers as characters

		int sum = 0;
		// get number of digits
		int power = numDigits.length;

		for (int i = 0; i < numDigits.length; i++) {
			// converting character to digit base 10
			int digit = Character.digit(numDigits[i], 10);
			// digit to power
			sum = sum + (int) Math.pow(digit, power);
			// type casting double to int bc math.pow gives a double
		}

		if (sum == num) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	// prime factor is a prime number < the given number which divides the given number
	public List<Long> calculatePrimeFactorsOf(long l) {
		List<Long> primeFactors = new ArrayList<>();
		long n = l; // copy to a different variable as we will be modifying it

		// Base case
		if (l == 2) {
			primeFactors.add(2L);
		}
		
		// have to also add 3 because prime and sqrt
		if (l == 3) {
			primeFactors.add(3L);
		}
		
		// math.sqrt returns the correctly rounded positive square root of a double value, auto typecasts
		for (int i = 2; i <= Math.sqrt(l); i++) {
			while (n % i == 0) {
				primeFactors.add((long) i);
				n /= i;
			}
		}
		return primeFactors;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
			this.key = key;
		}

		public String rotate(String string) {
			String output = "";
			for (Character c : string.toCharArray()) {
				if (c >= 'a' && c <= 'z') {
					output += (char) ('a' + ((c - 'a' + key) % 26));
					// % 26 bc 26 is the base of the modulo--after 26 repeats all etc
					// lowercase and uppercase have different ascii values
				} else if (c >= 'A' && c <= 'Z') {
					output += (char) ('A' + ((c - 'A' + key) % 26));
				} else {
					output += c;
				}
			}
			return output;
		}

	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	// TODO add comments
	public int calculateNthPrime(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException();
		}
		int primeNumber = 1; // Initialize with 1
		while (n > 0) {
			for (int i = primeNumber + 1;; i++) {
				int j = 2;
				for (; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						break;
					}
				}

				if (j > Math.sqrt(i)) {
					// found the prime number
					n--;
					primeNumber = i;
					break;
				}
			}
		}
		return primeNumber;
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			// TODO Write an implementation for this method declaration
			return null;
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			return null;
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	// TODO redo isValidisbn
	public boolean isValidisbn(String string) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				sum += Integer.parseInt(Character.toString(string.charAt(i)));
			else
				sum += 3 * Integer.parseInt(Character.toString(string.charAt(i)));
		}
		if (sum % 10 == 0)
			return true;
		else
			return false;
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	// can get the index of alphabet by subtracting alpha chars bc each ascii char
	// has a value so if you subtract the actual letter it gives you the
	// position(index) in the alphabet

	public boolean isPangram(String str) {
		// occurrence is boolean array of size 26 (number of characters in the alphabet)
		// a true indicates that we have seen that character
		// occurrence[0] - true--we have seen 'a'
		// occurrence[0] - false--we have not seen 'a'
		boolean[] occurrence = new boolean[26];
		// remove all characters except small and cap a-z
		str = str.replaceAll("[^A-Za-z]", "");
		// put all in new string
		// declare new array c, go through, put each char in it
		for (char c : str.toCharArray()) {
			// ascii a = 97, b = 98, ... z = 122
			// if char c is 'b', the index is 1
			// occurrence[1] = true
			occurrence[Character.toLowerCase(c) - 'a'] = true; // set to true
		}
		
		// at the end of the loop, occurrence will have trues for all the characters you have see

		for (boolean flag : occurrence) {
			// flag is the loop variable getting all 26 values of occurence
			// if condition needs to be evaluated to true, if flag is false, !flag will be true
			if (!flag) {
				// have not seen this character, so is not a pangram, so return false
				return false;
			}
		}
		return true;
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		// TODO Write an implementation for this method declaration
		return null;
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int n, int[] set) {
		Set<Integer> multiples = new HashSet<>();
		// created set of integers to a new hashset bc we want no duplicates
		for (int multiplier : set) {
			// adding to set all multiples which are less than the given number
			for (int i = 1; i * multiplier < n; i++) {
				multiples.add(multiplier * i);
			}
		}

		int sum = 0;
		for (int i : multiples) {
			sum += i;
		}
		return sum;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	// split string at spaces into array
	// TODO add comments
	public int solveWordProblem(String string) {
		string = string.replaceAll("\\?", "");
		String[] tokens = string.split(" ");
		int operand1 = Integer.parseInt(tokens[2]);
		int operand2;
		if (tokens[4].equals("by")) {
			operand2 = Integer.parseInt(tokens[5]);
		} else {
			operand2 = Integer.parseInt(tokens[4]);
		}


		if (tokens[3].equals("plus")) {
			return operand1 + operand2;
		} else if (tokens[3].equals("minus")) {
			return operand1 - operand2;
		} else if (tokens[3].equals("multiplied")) {
			return operand1 * operand2;
		} else {
			return operand1 / operand2;
		}
	}

}
