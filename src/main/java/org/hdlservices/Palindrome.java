package org.hdlservices;


import java.util.stream.IntStream;

/**
 * Palindrome is a word or a phrase that reads the same backward as it goes forward
 * Palindrome - civic, racecar
 * Not Palindrome - swims, wifi, mad
 */
public class Palindrome {
    public static void main(String[] args) {
        String word = "pup";
        System.out.println("Does the  word '" + word + "' is palindrome: " + isPalindrome(word));
    }

    private static boolean isPalindrome(String word) {
        String normalized = word.toLowerCase();
        return IntStream.range(0, normalized.length() / 2)
                .allMatch(i -> normalized.charAt(i) == normalized.charAt(normalized.length() - i - 1));
    }
}
