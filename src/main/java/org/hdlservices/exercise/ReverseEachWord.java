package org.hdlservices.exercise;

public class ReverseEachWord {
    private static String reverseWord(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }

        String[] arr = word.split(" ");
        StringBuilder reverseWord = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            reverseWord.append(new StringBuilder(arr[i]).reverse());
            if (i != arr.length - 1) {
                reverseWord.append(" ");
            }
        }

        return reverseWord.toString();
    }


    public static void main(String[] args) {
        String input = "Hello, my name is";
        System.out.println(input);
        System.out.println(reverseWord(input));
    }
}
