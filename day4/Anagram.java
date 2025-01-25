package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String name1 = "spot";
		String name2 = "pots";

		if (name1.length() == name2.length()) {
			char[] charArray1 = name1.toCharArray();
			char[] charArray2 = name2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result = Arrays.equals(charArray1, charArray2);
			if (result) {
			System.out.println("The given strings are Anagram");
			}
		}
		else {
			System.out.println("Lengths mismatch,the strings are not Anagram");
		}
		
	}

}
