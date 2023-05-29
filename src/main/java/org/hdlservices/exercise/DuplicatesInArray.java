package org.hdlservices.exercise;

import java.util.Arrays;

public class DuplicatesInArray {

    //Method 1 : Brute Force Method
    private static void findDuplicatesUsingBruteForce(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    System.out.println("Duplicate Element : " + inputArray[i]);
                }
            }
        }
    }

    //Method 2 : Sorting Method
    private static void findDuplicatesUsingSorting(int[] inputArray) {
        Arrays.sort(inputArray);
        for (int i = 0; i < inputArray.length-1; i++) {
            if (inputArray[i] == inputArray[i + 1]) {
                System.out.println("Duplicate Element : " + inputArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{111, 333, 555, 777, 333, 444, 555};

        System.out.println("======Duplicates Using Brute Force======");
        findDuplicatesUsingBruteForce(inputArray);

        System.out.println("======Duplicates Using Sorting======");
        findDuplicatesUsingSorting(inputArray);
//
//        System.out.println("======Duplicates Using HashSet======");
//
//        findDuplicatesUsingHashSet(inputArray);
//
//        System.out.println("======Duplicates Using HashMap======");
//
//        findDuplicatesUsingHashMap(inputArray);
//
//        System.out.println("======Duplicates Using Java 8 Streams======");
//
//        findDuplicatesUsingJava8(inputArray);
    }
}
